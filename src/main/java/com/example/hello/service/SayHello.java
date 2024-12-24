package com.example.hello.service;

import com.example.hello.config.HelloConfig;

/*
Shing 2024/12/23
*/
public class SayHello {
    private HelloConfig helloConfig;

    public SayHello(HelloConfig helloConfig) {
        this.helloConfig = helloConfig;

    }

    public String sayHello() {
        return "Hello: " + helloConfig.getMsg();
    }

    public String sayHello(String msg) {
        if (msg != null && msg.length() > 0) {
            return "Hello: " + msg;
        }
        return "Hello: " + helloConfig.getMsg();
    }
}
