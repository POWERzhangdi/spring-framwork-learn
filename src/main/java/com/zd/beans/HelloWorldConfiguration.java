package com.zd.beans;


import org.springframework.context.annotation.Bean;

public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){
        return "HelloWold : " + System.currentTimeMillis();
    }

}
