package com.chenx.dubbo;

import com.chenx.pojo.Order;

// 跟order模块路径、内容完全一致
public interface OrderService {
    Order getOrder(Long orderId);
}
