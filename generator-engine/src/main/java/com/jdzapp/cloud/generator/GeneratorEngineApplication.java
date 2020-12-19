package com.jdzapp.cloud.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableDiscoveryClient
@SpringBootApplication
@EnableOpenApi
public class GeneratorEngineApplication {
    public static void main(String[] args) {
        SpringApplication.run(GeneratorEngineApplication.class, args);
    }

}
