package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method= RequestMethod.GET)
    public String hello() {
        return "Hello Spring MVC";
    }
    @RequestMapping(value ="/end", method= RequestMethod.GET)
    public boolean end() {
        throw new OutOfMemoryError();
    }
}