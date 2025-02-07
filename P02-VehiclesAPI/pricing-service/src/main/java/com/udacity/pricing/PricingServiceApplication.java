package com.udacity.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * Creates a Spring Boot Application to run the Pricing Service.
 * Convert the application from a REST API to a microservice.
 */
@SpringBootApplication
@EnableEurekaClient
public class PricingServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(PricingServiceApplication.class, args);
    }

}
