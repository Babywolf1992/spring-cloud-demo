package com.wolf.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by babywolf on 16/2/27.
 */
@Component
public class MainController {
    @HystrixCommand(fallbackMethod = "defaultStores")
    public String getStores() {
        //do stuff that might fail
        return "hello";
    }

    public String defaultStores() {
        /* something useful */
        return "something useful";
    }
}
