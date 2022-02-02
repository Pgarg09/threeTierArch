package com.kpmg.threeTierArch.controller;

import com.kpmg.threeTierArch.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {
    @Autowired
    GreetingsService service;

    @RequestMapping("/greetings")
    public String greetings(@RequestParam String name)
    {
        return service.getGreetings(name);
    }
}
