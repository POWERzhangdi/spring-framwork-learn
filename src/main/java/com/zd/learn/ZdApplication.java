package com.zd.learn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author PowerZzzD
 * {@link SpringApplication}
 * {@link SpringApplicationBuilder}
 * {@link ConfigurableApplicationContext}
 * springboot的启动
 * ConfigurableApplicationContext 说明：
 * 此接口 结合了了所有 ApplicationContext需要实现的接口，它在次基础上增加了配置应用上下文的功能  应用上下文生命周期的接口
 * AnnotationConfigApplicationContext 对象也可以启动 有兴趣 可以去了解一下
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.zd.beans")
public class ZdApplication {

    public static void main(String[] args) {
        /**
         * 一种做法 它return的是 ConfigurableApplicationContext 扫描配置的上下文
         * 所以可以用到  ConfigurableApplicationContext启动
         * 配合 @SpringBootApplication 注解
         */

        //SpringApplication.run(ZdApplication.class);


        /**
         * 第二中启动方式 bulider 模式
         * 这个模式的好处 可以自己指定容器 怎么启动
         * 这里是 非web模式启动 为了 自定义注解
         * return 的还是 ConfigurableApplicationContext 对象
         * 这里启动注掉 @SpringBootApplication 注解
         */
        ConfigurableApplicationContext context =  new SpringApplicationBuilder(ZdApplication.class).
                web(WebApplicationType.NONE).
                run(args);
        System.out.println(context.getBean("myOneCustomBean"));
        context.close();
    }

}
