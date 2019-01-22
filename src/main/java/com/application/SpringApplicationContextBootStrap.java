package com.application;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 观察 springboot启动时候引导类的推断
 */

@SpringBootApplication
public class SpringApplicationContextBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationContextBootStrap.class)
                .web(WebApplicationType.SERVLET)//调整类型观察变化 没有引入 响应式的包所以会报错无关紧要
                .run(args);
        System.out.println("推断启动那个上下文操作"+context.getClass().getName());
        System.out.println("推断启动那个env操作"+context.getEnvironment().getClass().getName());
        //上下文关闭
        context.close();
    }

}
