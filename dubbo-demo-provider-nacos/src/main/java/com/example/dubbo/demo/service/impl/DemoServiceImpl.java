package com.example.dubbo.demo.service.impl;

import com.example.dubbo.demo.api.DemoService;
import com.example.dubbo.demo.model.Request;
import com.example.dubbo.demo.model.User;
import org.apache.dubbo.common.utils.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@DubboService(version = "1.0.2")
public class DemoServiceImpl implements DemoService {
    static List<User> users = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            User e = new User();
            e.setName("副老师-" + i);
            e.setEmail("captain@fit2cloud.com");
            e.setStatus("ACTIVE");
            e.setCreateTime(new Date());
            e.setUpdateTime(new Date());
            users.add(e);
        }
    }

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String greeting(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User getOne(String name) {
        return users.stream().filter(u -> u.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public User getOne(Request request) throws Exception {
        if (StringUtils.isBlank(request.getName())) {
            throw new Exception("name 不能为空");
        }
        if (StringUtils.isBlank(request.getEmail())) {
            throw new Exception("email 不能为空");
        }
        return users.stream().filter(u -> u.getName().equals(request.getName())
                && u.getEmail().equals(request.getEmail())).findFirst().orElse(null);
    }

    @Override
    public User getOne(String name, String email) throws Exception {
        if (StringUtils.isBlank(name)) {
            throw new Exception("name 不能为空");
        }
        if (StringUtils.isBlank(email)) {
            throw new Exception("email 不能为空");
        }
        return users.stream().filter(u -> u.getName().equals(name)
                && u.getEmail().equals(email)).findFirst().orElse(null);
    }
}