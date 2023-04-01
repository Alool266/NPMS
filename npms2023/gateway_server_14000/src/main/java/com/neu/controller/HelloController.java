package com.neu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/admin/hello")
    public String helloAdmin() {
        return "hello admin";
    }

    @GetMapping("/user/hello")
    public String helloUser() {
        return "hello user";
    }
}
