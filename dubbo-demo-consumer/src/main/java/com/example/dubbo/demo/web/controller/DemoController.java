package com.example.dubbo.demo.web.controller;

import com.example.dubbo.demo.api.DemoService;
import com.example.dubbo.demo.api.HelloWorldService;
import com.example.dubbo.demo.model.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * demo 控制器
 *
 * @author jeftom
 * @date 2019-03-24 00:51
 * @since 1.0.0
 */
@RestController
public class DemoController {

    @DubboReference
    private DemoService demoService;
    @DubboReference
    private HelloWorldService helloWorldService;

    @GetMapping(value = "/index")
    public String greeting() {
        return demoService.greeting("dubbo");
    }

    @GetMapping(value = "/users")
    public List<User> users() {
        return demoService.getUsers();
    }
}
