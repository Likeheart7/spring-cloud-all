package com.chenx.feign;

import com.chenx.pojo.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("ware-service")
public interface WareServiceFeign {
    /*
    这里用于反序列化请求结果的Stock可以和远程服务得Stock一些不同。比如这里就少一个desc是修改呢
     */
    @GetMapping("/ware/get/{id}")
    public Stock getStock(@PathVariable("id") Long id);
}
