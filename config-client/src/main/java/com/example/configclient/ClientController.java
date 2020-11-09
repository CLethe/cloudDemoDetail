package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${a.b}")
    private String name;

    @RequestMapping("/client")
    public String t1(){
        return name;
    }
}
