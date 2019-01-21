package com.application;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 项目初始化加载顺序
 * 配置数据元 spring.factories
 * springApplication 启动准备阶段
 */

@SpringBootApplication
public class OrderApplicationInit {

    /**
     * 加载顺序两种实现形式  @Order注解 | interface Ordered
     * @param args
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .web(WebApplicationType.NONE)
                .sources(OrderApplicationInit.class)
                .run(args);
    }

}
