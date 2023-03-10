package com.example.dubbo.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.dubbo.demo.api.ComplexDemoService;
import com.example.dubbo.demo.model.ComplexRequest;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.2")
public class ComplexDemoServiceImpl implements ComplexDemoService {

    @Override
    public void complexDemo(ComplexRequest request) {
        System.out.println(JSON.toJSONString(request));
    }
}