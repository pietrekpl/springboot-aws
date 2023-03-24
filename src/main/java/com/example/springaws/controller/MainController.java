package com.example.springaws.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class MainController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{name}")
    public String sayHello(@PathVariable("name") String name) {
        log.info("In method sayHello()");
        return "Hello, " + name;
    }

}
