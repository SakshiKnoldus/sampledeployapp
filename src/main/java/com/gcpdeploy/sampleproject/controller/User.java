package com.gcpdeploy.sampleproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User {

    @GetMapping("/name")
    public String getName() {
        return "Hello Sakshi";
    }

}
