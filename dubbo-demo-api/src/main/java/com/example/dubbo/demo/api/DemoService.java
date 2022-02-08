package com.example.dubbo.demo.api;


import com.example.dubbo.demo.model.Request;
import com.example.dubbo.demo.model.User;

import java.util.List;

public interface DemoService {
    String greeting(String name);

    List<User> getUsers();

    User getOne(String name);

    User getOne(Request request) throws Exception;

    User getOne(String name, String email) throws Exception;
}
