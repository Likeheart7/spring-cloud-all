package com.chenx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("sleuth-service-c")
public interface ServiceCFeign {
    @GetMapping("/serviceC/get")
    public String get();
}
