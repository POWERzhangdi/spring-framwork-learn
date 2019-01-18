package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * {@link SpringApplication}
 *  springApplication 是springboot的启动入口
 *  入参：
 *  Class<?> primarySource 启动源 参数 也就是 java class的配置类  或者是 xml的源
 *  String... args 启动入参
 */

//@SpringBootApplication
public class LearnApplication {

    /**
     * 不带 @SpringBootApplication注解的话 整个项目是不能启动的因为spring 不认为这个是一个 启动配置项
     * 此注解是 @Configuration 的派生 @Component 的派生
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(LearnApplication.class,args);
        //注意的是要想启动的源primarySource，此类就必须含有@SpringBootApplication作用
        SpringApplication.run(Run.class,args);
    }


    /**
     * 注意点
     * SpringApplication的启动不一定是当前类 LearnApplication
     * 这样也可以
     */
    @SpringBootApplication
    public static class Run{
    }

}
