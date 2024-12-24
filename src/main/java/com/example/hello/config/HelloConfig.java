package com.example.hello.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/*
Shing 2024/12/23
*/
//@Configuration
//@Data
@ConfigurationProperties(prefix = "com.example.hello")
public class HelloConfig {
    private String msg;

    public HelloConfig() {}


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
