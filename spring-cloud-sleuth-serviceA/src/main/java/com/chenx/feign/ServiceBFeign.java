package com.chenx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("sleuth-service-b")
public interface ServiceBFeign {
    @GetMapping("/serviceB/get")
    public String get();
}
