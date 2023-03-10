package com.example.dubbo.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class ComplexRequest {
    private String id;
    private List<User> users;
}
