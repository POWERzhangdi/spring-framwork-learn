package com.application.order;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * 这里依靠 @order注解实现排序
 * @param <C>
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class BeforeApplication<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("before :" + configurableApplicationContext.getId());
    }
}
