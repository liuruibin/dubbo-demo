package com.example.dubbo.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String name;
    private String email;
    private String status;
    private Date createTime;
    private Date updateTime;
}
