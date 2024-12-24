package com.example.hello.autoConfig;

import com.example.hello.config.HelloConfig;
import com.example.hello.service.SayHello;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/*
Shing 2024/12/23
*/
@AutoConfiguration
@ConditionalOnClass(HelloConfig.class)
@EnableConfigurationProperties(HelloConfig.class)
//@ConditionalOnProperty(prefix = "hello", value = "enabled", matchIfMissing = true)
public class HelloAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(SayHello.class)
    public SayHello sayHello(HelloConfig helloConfig) {
        return new SayHello(helloConfig);
    }
}
