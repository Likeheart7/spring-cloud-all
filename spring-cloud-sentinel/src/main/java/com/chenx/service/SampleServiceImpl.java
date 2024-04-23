package com.chenx.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class SampleServiceImpl {

    @SentinelResource("getService") // 只有失明了资源点，sentinel才实施保护
    public String get() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "access success";
    }
}
