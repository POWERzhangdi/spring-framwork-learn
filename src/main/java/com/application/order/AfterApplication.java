package com.application.order;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * 这里可以实现  {@link Ordered} 接口来实现 getOrder() 方法实现排序
 * @param <C>
 */
public class AfterApplication<C extends ConfigurableApplicationContext>
        implements ApplicationContextInitializer, Ordered {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("after :" + configurableApplicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
