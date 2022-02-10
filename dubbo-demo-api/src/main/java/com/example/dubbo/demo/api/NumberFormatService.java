package com.example.dubbo.demo.api;

import com.example.dubbo.demo.model.Amount;
import com.example.dubbo.demo.model.BigDecimalRequest;
import com.example.dubbo.demo.model.NumberRequest;
import com.example.dubbo.demo.model.User;

import java.util.Map;

public interface NumberFormatService {
    User getOne(BigDecimalRequest name);

    Amount getAmount();

    Map<String, Object> getNumbers(Map<String, Object> params);

    Object getNumbers(NumberRequest request);
}
