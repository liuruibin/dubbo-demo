package com.example.dubbo.demo.api;

import com.example.dubbo.demo.model.Amount;
import com.example.dubbo.demo.model.BigDecimalRequest;
import com.example.dubbo.demo.model.User;

public interface DigDecimalService {
    User getOne(BigDecimalRequest name);

    Amount getAmount();
}
