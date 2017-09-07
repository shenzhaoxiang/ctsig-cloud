package com.ctsig.cloud.example.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class ServiceProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProducerApplication.class, args);
    }

}