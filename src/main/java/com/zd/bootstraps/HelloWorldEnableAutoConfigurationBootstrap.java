package com.zd.bootstraps;

import com.zd.annotations.EnableAutoHelloWoldAnnotation;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * 注解实现 一个@Enable装配
 */
@EnableAutoHelloWoldAnnotation
public class HelloWorldEnableAutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  new SpringApplicationBuilder(HelloWorldEnableAutoConfigurationBootstrap.class).
                web(WebApplicationType.NONE).
                run(args);
        System.out.println(context.getBean("helloWorld", String.class));
        context.close();
    }

}
