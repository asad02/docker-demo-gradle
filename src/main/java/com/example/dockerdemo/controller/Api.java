package com.example.dockerdemo.controller;

import com.example.dockerdemo.controller.service.InstantInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @Autowired
    private InstantInfo instantInfo;


    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/info")
    public String getInstanceInfo() {
        return "I am returning from cluster v3 " + instantInfo.getInstanceInfo();
    }
}
