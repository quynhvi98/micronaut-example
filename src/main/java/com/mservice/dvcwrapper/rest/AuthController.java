package com.mservice.dvcwrapper.rest;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.security.annotation.Secured;
import io.micronaut.views.View;

import javax.annotation.Nullable;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

//@Secured("isAuthenticated()")
@Secured("isAnonymous()")
@Controller("/")
public class AuthController {

//    @Produces(MediaType.TEXT_PLAIN)
//    @Get("/")
//    public String index(Principal principal) {
//        return principal.getName();
//    }

    @Get("/")
    @View("home")
    Map<String, Object> index(@Nullable Principal principal) {
        Map<String, Object> data = new HashMap<>();
        data.put("loggedIn", principal != null);
        if (principal != null) {
            data.put("username", principal.getName());
        }
        return data;
    }
}
