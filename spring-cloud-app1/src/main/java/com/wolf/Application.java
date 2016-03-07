package com.wolf;

import com.wolf.com.wolf.controller.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by babywolf on 16/2/27.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@FeignClient
@RestController
public class Application extends SpringBootServletInitializer {
    @Autowired
    private MainController mainController;

    private LoadBalancerClient loadBalancerClient;
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @RequestMapping(value = "/app1")
    public String app() {
        return mainController.getStores();
    }

    @RequestMapping(value = "/welcome")
    public String welcome() {
        return "welcome app1";
    }
}