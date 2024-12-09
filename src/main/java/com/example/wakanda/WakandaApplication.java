package com.example.wakanda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WakandaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WakandaApplication.class, args);
    }

}
