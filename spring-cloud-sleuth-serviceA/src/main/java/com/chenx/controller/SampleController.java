package com.chenx.controller;

import com.chenx.feign.ServiceBFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class SampleController {
    @Autowired
    private ServiceBFeign feign;

    @GetMapping("/serviceA/get")
    public String get() {
        String result = feign.get();
        try {
            TimeUnit.MILLISECONDS.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "service A -> " + result;
    }
}
