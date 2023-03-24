package com.example.springaws.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hello, " + name;
    }

}
