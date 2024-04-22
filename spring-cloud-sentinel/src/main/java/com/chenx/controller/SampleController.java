package com.chenx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/testLimit")
    public String testLimit() {
        return "Success";
    }
}
