package com.example.servicediscover01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscover01Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscover01Application.class, args);
    }

}
