package com.application.listener;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * {@link ConfigFileApplicationListener 加载配置文件事件  里面可以加载 properties or yml 等文件}
 * 这里写了一个 验证  看 在 加载之前自定义的before的 顺序要高于  ConfigFileApplicationListener 事件
 * ConfigFileApplicationListener 的属性 String DEFAULT_NAMES = "application"  默认加载的文件名称是 application 开否的
 * 要注意 ConfigFileApplicationListener 实现的 是 ApplicationListener 事件 在配置加载元的时候要配置对
 */
public class BeforeConfigFileApplicationListener implements Ordered, SmartApplicationListener {


    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
                || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public int getOrder() {
        //ConfigFileApplicationListener.DEFAULT_ORDER - 1 按照这个排序加载的话啊 第一的 name 不会有值 为 null  因为 ConfigFileApplicationListener
        // 还没有监听起来 配置文件
        //ConfigFileApplicationListener.DEFAULT_ORDER + 1 可以看得name 的值 因为 已经加载起来了 加载顺序要低与 ConfigFileApplicationListener
        return ConfigFileApplicationListener.DEFAULT_ORDER + 1;
    }


    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationEnvironmentPreparedEvent) {
            ApplicationEnvironmentPreparedEvent environmentPreparedEvent = (ApplicationEnvironmentPreparedEvent) event;
            ConfigurableEnvironment environment =  environmentPreparedEvent.getEnvironment();
            //乱码无所谓 读出来即可
            System.out.println("启动的加载properties:" + environment.getProperty("name"));
        }
        if (event instanceof ApplicationPreparedEvent) {
        }
    }
}
