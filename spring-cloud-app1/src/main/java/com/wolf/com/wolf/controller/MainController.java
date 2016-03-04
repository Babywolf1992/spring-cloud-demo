package com.wolf.com.wolf.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by babywolf on 16/2/27.
 */
@RestController
@RequestMapping(value = "/app1")
public class MainController {
    @RequestMapping(value = "/welcome")
    public String welcome() {
        return this.getStores(null);
    }

    @HystrixCommand(fallbackMethod = "defaultStores")
    public String getStores(Map<String, Object> parameters) {
        //do stuff that might fail
        return "hello";
    }

    public String defaultStores(Map<String, Object> parameters) {
        /* something useful */
        return "something useful";
    }
}
