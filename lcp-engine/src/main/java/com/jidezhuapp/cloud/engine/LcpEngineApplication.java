package com.jidezhuapp.cloud.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LcpEngineApplication {
    public static void main(String[] args) {
        SpringApplication.run(LcpEngineApplication.class, args);
    }

}
