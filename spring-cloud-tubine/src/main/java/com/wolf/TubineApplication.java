package com.wolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by babywolf on 16/3/3.
 */
@SpringBootApplication
//@EnableDiscoveryClient
@EnableTurbine
public class TubineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TubineApplication.class,args);
    }
}
