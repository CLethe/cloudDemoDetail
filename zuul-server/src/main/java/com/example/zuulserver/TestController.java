package com.example.zuulserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/user01")
    public String t1(){
        return "hah";
    }
}
