package com.chenx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SleuthServiceBApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthServiceBApplication.class, args);
    }
}