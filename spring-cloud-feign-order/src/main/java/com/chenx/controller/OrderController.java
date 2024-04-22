package com.chenx.controller;

import com.chenx.feign.WareServiceFeign;
import com.chenx.pojo.Stock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    Logger log = LoggerFactory.getLogger(OrderController.class);
    @Resource
    private WareServiceFeign wareServiceFeign;

    @GetMapping("/getStock/{id}")
    public Stock getStock(@PathVariable("id") Long id) {
        Stock stock = wareServiceFeign.getStock(id);
        log.info("获取到库存数据");
        return stock;
    }
}
