package com.allonkwok.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.allonkwok.test.controller")
public class HelloApp {
    public static void main(String[] args){
        SpringApplication.run(HelloApp.class, args);
    }
}
