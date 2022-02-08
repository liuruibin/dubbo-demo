package com.example.dubbo.demo.service;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DubboDemoZookeeperApplication {

    public static void main(String[] args) {
        /**
         *  非web的方式启动
         */
        new SpringApplicationBuilder(DubboDemoZookeeperApplication.class).web(WebApplicationType.NONE).run(args);
    }


}
