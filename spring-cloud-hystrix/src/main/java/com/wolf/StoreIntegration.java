package com.wolf;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by babywolf on 16/3/3.
 */
@Component
public class StoreIntegration {

    @HystrixCommand(fallbackMethod = "defaultStores")
    public Object getStores(Map<String, Object> parameters) {
        //do stuff that might fail
        return "success";
    }

    public Object defaultStores(Map<String, Object> parameters) {
        /* something useful */
        return "something useful";
    }
}