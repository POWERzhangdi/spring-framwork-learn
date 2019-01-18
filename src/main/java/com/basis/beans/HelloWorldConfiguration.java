package com.basis.beans;


import org.springframework.context.annotation.Bean;

public class HelloWorldConfiguration {

    //默认method的名字 这个名字是bean的名字
    @Bean
    public String helloWorld(){
        return "HelloWold : " + System.currentTimeMillis();
    }

}
