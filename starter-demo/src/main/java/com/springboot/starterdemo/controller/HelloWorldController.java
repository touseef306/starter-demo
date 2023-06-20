package com.springboot.starterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //http:localhost:8080/hello

    //GET

    @GetMapping("hello")
    public String helloworld(){
        return "hello from spring boot rest api";
    }
}
