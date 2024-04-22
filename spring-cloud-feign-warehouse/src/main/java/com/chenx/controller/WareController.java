package com.chenx.controller;

import com.chenx.pojo.Stock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class WareController {
    @GetMapping("/ware/get/{id}")
    public Stock getStock(@PathVariable("id") Long id) {
        if (Objects.isNull(id)) return null;
        if (id == 10001) {
            return new Stock(10001L, "华为Pura 60 pro", 999, "台", "华为p系列升级");
        } else if (id == 10002) {
            return new Stock(10002L, "华为Mate 60 pro", 0, "台", "华为旗舰");
        } else {
            return null;
        }
    }
}
