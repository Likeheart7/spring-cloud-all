package com.chenx.controller;

import com.chenx.service.SampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class SampleController {

    @Autowired
    private SampleServiceImpl service;

    @GetMapping("/testLimit")
    public String testLimit() {
        // 休眠100毫秒
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Success";
    }

    @GetMapping("/testDegrade")
    public String testDegrade() {
        // 休眠100毫秒
        
        return service.get();
    }
}
