package com.chenx.springcloudribbon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    private Logger log = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/msg")
    public String msg() {
        String msg = restTemplate.getForObject("http://provider-service/provider/msg", String.class);
        log.info("consumer-service获得数据, " + msg);
        return msg;
    }

}
