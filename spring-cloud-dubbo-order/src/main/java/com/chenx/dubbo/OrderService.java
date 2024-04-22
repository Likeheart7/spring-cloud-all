package com.chenx.dubbo;

import com.chenx.pojo.Order;

public interface OrderService {
    Order getOrder(Long orderId);
}
