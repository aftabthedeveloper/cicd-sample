package com.aftabthedeveloper.projects.cicdsample.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/app")
@AllArgsConstructor
public class AppController {

    @GetMapping
    public String info(){
        return "This is a CI/CD Sample application";
    }
}
