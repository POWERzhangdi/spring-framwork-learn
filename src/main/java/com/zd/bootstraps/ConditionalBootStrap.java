package com.zd.bootstraps;


import com.zd.conditionals.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


public class ConditionalBootStrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "PowerZzzD")
    public String helloWorld() {
        return "Hello,World 张迪";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String bean = context.getBean("helloWorld",String.class);
        System.out.println(bean);
        context.close();
    }


}
