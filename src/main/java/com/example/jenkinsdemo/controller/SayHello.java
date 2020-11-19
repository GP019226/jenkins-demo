package com.example.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class SayHello {

    @GetMapping("/hello")
    public Object say(){
        return "Hello world";
    }
}
