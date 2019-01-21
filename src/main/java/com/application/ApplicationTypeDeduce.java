package com.application;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * application启动的时候类型推断
 * {@link WebApplicationType}
 * springApplication 启动准备阶段
 */

@SpringBootApplication
public class ApplicationTypeDeduce {

    /**
     * 1.这里自动类型的推断
     * WebApplicationType deduceWebApplicationType()自动类型推断方法
     * org.springframework.web.reactive.DispatcherHandler && !org.springframework.web.servlet.DispatcherServlet
     * 启动是 reactive
     * 2.自动推断main函数 依靠堆栈 deduceMainApplicationClass() 来实现 for这遍历main.equals()
     * 推断main 函数
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .web(WebApplicationType.SERVLET)
                .sources(ApplicationTypeDeduce.class)
                .run(args);
    }

}
