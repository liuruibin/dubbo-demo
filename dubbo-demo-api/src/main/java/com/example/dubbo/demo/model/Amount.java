package com.example.dubbo.demo.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Amount {
    private User user;
    private BigDecimal amount;
}
