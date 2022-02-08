package com.example.dubbo.demo.service.impl;

import com.example.dubbo.demo.api.HelloWorldService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService(version = "1.0.0")
public class HelloWorldServiceImpl implements HelloWorldService {

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String sayHello() {
        return String.format("[%s] : Hello, %s", serviceName);
    }
}