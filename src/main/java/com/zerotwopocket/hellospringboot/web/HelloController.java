package com.zerotwopocket.hellospringboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(@RequestParam("message") String message){
       return "Hello, "+ message+", from Spring boot!";
    }
}
