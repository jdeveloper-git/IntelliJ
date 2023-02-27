package com.example.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MyApp")
public class RestDemo {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hi";
    }
}
