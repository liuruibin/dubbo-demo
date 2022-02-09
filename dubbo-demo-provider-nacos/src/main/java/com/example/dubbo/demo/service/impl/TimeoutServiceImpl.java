package com.example.dubbo.demo.service.impl;

import com.example.dubbo.demo.api.TimeoutService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService(version = "1.0.1")
public class TimeoutServiceImpl implements TimeoutService {

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String timeout() {
        try {
            Thread.sleep(6_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return String.format("Hello, %s", serviceName);
    }
}