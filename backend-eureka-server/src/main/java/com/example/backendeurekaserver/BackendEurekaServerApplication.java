package com.example.backendeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BackendEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackendEurekaServerApplication.class, args);
    }
}
