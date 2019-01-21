package com.application;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 事件监听加载顺序
 * springApplication 启动准备阶段
 */

@SpringBootApplication
public class ListenerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .web(WebApplicationType.NONE)
                .sources(ListenerApplication.class)
                .run(args);
    }
}
