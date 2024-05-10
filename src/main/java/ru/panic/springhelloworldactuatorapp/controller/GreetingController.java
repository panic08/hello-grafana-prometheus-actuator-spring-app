package ru.panic.springhelloworldactuatorapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/hello-to")
    public String helloWorldTo(@RequestParam("first_name") String firstName) {
        return "Hello, " + firstName;
    }
}
