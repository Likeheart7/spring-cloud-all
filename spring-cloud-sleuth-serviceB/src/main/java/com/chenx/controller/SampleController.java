package com.chenx.controller;

import com.chenx.feign.ServiceCFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class SampleController {
    @Autowired
    private ServiceCFeign serviceCFeign;

    @GetMapping("/serviceB/get")
    public String get() {
        String result = serviceCFeign.get();
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "service-b -> " + result;
    }
}
