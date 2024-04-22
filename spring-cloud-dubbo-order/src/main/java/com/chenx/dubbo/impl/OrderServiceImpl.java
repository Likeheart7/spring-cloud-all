package com.chenx.dubbo.impl;

import com.chenx.dubbo.OrderService;
import com.chenx.pojo.Order;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService // 这个注解会让该类被注册到注册中心上
public class OrderServiceImpl implements OrderService {
    @Override
    public Order getOrder(Long orderId) {
        if (orderId == null || orderId <= 0) return null;
        Order order = null;
        if (orderId == 1001) {
            order = new Order(1001L, 10001L, "华为Pura 60", "我也要买华为", 3);
        } else if (orderId == 1002) {
            order = new Order(1002L, 10002L, "华为Mate 60 Pro", "加钱也要买Mate 60p", 1);
        }
        return order;
    }
}
