package com.application.listener;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;


/**
 * 这里监听 ContextRefreshedEvent 事件 也是来佐证 order 的排序
 */
@Order(Ordered.LOWEST_PRECEDENCE)
public class AfterListenerApplication<E extends ContextRefreshedEvent> implements ApplicationListener<E> {

    @Override
    public void onApplicationEvent(E e) {
        System.out.println("after listener " + e.getApplicationContext().getId() +"发生时间: " + System.currentTimeMillis());
    }
}
