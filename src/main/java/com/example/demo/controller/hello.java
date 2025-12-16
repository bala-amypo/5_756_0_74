 package com.example.demo.controller;

 @RestController
public class hello {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
