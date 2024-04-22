package com.chenx.controller;

import com.chenx.dubbo.OrderService;
import com.chenx.pojo.Order;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @DubboReference
    private OrderService orderService;

    @GetMapping("/getOrder/{orderId}")
    public Order getOrder(@PathVariable("orderId") Long orderId) {
        return orderService.getOrder(orderId);
    }
}
