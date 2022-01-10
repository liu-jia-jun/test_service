package com.example.service_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author asus
 */
@RestController
public class ServiceController {
    @GetMapping("/")

    public String getMessage(){
        return "message2";
    }
    @GetMapping("/test")

    public String test(){
        return "test2";
    }
}
