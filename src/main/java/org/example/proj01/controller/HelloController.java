package org.example.proj01.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

     @GetMapping("/hw/")
    public String hello()
    {
        return "hello, world!";
    }
}
