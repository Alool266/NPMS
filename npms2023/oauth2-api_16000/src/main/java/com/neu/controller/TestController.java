package com.neu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class TestController {
    @GetMapping("user/h1")
    public String test1(){
        return "user";
    }
    @GetMapping("admin/a1")
    public String test2(){
        return "admin";
    }

}
