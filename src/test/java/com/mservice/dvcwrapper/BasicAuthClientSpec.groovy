package com.mservice.dvcwrapper

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class BasicAuthClientSpec extends Specification {

    @Inject
    AppClient appClient

    def "Verify HTTP Basic Auth works"() {
        when:
        String credsEncoded = "admin:password".bytes.encodeBase64().toString()
        String rsp = appClient.home("Basic ${credsEncoded}")

        then:
        rsp == 'admin'
    }
}