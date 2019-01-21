package com.application.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

/**
 * 这里实现 ordered接口
 * @param <E>
 */
public class BeforeListenerApplication<E extends ContextRefreshedEvent>
        implements ApplicationListener<ContextRefreshedEvent>, Ordered {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("before listener " + contextRefreshedEvent.getApplicationContext().getId() + "发生时间: " + System.currentTimeMillis());
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
