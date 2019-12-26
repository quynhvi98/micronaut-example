package com.mservice.dvcwrapper.rest;

import com.mservice.dvcwrapper.bean.Conference;
import com.mservice.dvcwrapper.service.ConferenceService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/conferences")
public class ConferenceController {
    private final ConferenceService conferenceService;

    public ConferenceController(ConferenceService conferenceService) {
        this.conferenceService = conferenceService;
    }

    @Get("/random")
    public Conference randomConf() {
        Conference conference = new Conference();
        conference.setName("abc");
//        return conferenceService.randomConf();
        return conference;
    }
}
