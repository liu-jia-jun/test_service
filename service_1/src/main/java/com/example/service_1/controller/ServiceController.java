package com.example.service_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author asus
 */
@RestController
public class ServiceController {
    @GetMapping("/")

    public String getMessage(){
        return "message1";
    }
    @GetMapping("/test")

    public String test(){
        return "test1";
    }
}
