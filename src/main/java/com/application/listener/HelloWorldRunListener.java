package com.application.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 注意事项 这里的 构造器 需要 传递两个参数
 */
public class HelloWorldRunListener implements SpringApplicationRunListener {


    /**
     * 这两个参数必须需要 用不用再说 不然启动会报错
     * @param application
     * @param args
     */
    public HelloWorldRunListener(SpringApplication application, String[] args) {
    }

    @Override
    public void starting() {
        System.out.println("事件启动...");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

    }

    @Override
    public void started(ConfigurableApplicationContext context) {

    }

    @Override
    public void running(ConfigurableApplicationContext context) {

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {

    }
}
