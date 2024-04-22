package com.chenx.springcloudribbon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/provider/msg")
    public String sendMessage(){
        return "This is the message from provider service! port: " + port;
    }
}
