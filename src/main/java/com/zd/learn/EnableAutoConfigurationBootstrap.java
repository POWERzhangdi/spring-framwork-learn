package com.zd.learn;

import com.zd.annotations.EnableAutoHelloWoldAnnotation;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * 注解实现 一个@Enable装配
 */
@EnableAutoHelloWoldAnnotation
public class EnableAutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class).
                web(WebApplicationType.NONE).
                run(args);
        System.out.println(context.getBean("helloWorld", String.class));
        context.close();
    }

}
