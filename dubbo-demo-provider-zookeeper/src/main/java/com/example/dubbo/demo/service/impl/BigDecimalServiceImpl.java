package com.example.dubbo.demo.service.impl;

import com.example.dubbo.demo.api.DigDecimalService;
import com.example.dubbo.demo.model.Amount;
import com.example.dubbo.demo.model.BigDecimalRequest;
import com.example.dubbo.demo.model.User;
import org.apache.dubbo.config.annotation.DubboService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@DubboService(version = "1.0.2")
public class BigDecimalServiceImpl implements DigDecimalService {
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

    @Override
    public User getOne(BigDecimalRequest request) {
        System.out.println(request.getAmount());
        return users.get(0);
    }

    @Override
    public Amount getAmount() {
        Amount amount = new Amount();
        amount.setUser(users.get(0));
        amount.setAmount(new BigDecimal("5.00"));
        return amount;
    }
}
