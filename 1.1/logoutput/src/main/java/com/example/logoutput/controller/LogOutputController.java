package com.example.logoutput.controller;

import com.example.logoutput.service.RandomStringService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogOutputController {

    private final RandomStringService randomStringService;

    public LogOutputController(RandomStringService randomStringService) {
        this.randomStringService = randomStringService;
    }

    @GetMapping("/timestamp")
    public String getTimestamp() {
        return randomStringService.getRandomString();
    }

}
