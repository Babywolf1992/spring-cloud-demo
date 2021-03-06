package com.wolf;

import com.wolf.controller.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by babywolf on 16/2/27.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@RestController
public class Application2 {
    @Autowired
    private MainController mainController;

    public static void main(String[] args) {
        SpringApplication.run(Application2.class,args);
    }

    @RequestMapping(value = "/app2")
    public String app() {
        return mainController.getStores();
    }

    @RequestMapping(value = "/welcome")
    public String welcome() {
        return "welcome app2";
    }
}
