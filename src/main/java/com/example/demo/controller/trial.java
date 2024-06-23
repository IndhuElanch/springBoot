package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class trial {

    @GetMapping("/")
    public String getName(){
        return "Hello";
    }
}
