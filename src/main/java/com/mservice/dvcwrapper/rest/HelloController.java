package com.mservice.dvcwrapper.rest;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class HelloController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }

    @Get("/micronaut")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloMicronaut() {
        return "Hello, Micronaut!";
    }
}