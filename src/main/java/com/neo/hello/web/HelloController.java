package com.neo.hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello1")
    public String hello(String name){
        return "hello world,"+name;
    }
}
