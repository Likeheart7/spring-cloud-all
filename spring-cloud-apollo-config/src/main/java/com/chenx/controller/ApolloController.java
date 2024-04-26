package com.chenx.controller;

import com.chenx.service.ApolloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloController {
    @Autowired
    private ApolloService apolloService;

    @GetMapping("/path")
    public String getPath() {
        return apolloService.getFilePath();
    }

    @PostMapping("/apollo/{path}")
    public void updateApolloConfig(@PathVariable("path") String path) {
        apolloService.updateApolloConfig(path);
        apolloService.releaseParam();
    }
}
