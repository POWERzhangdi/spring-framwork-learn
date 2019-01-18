package com.basis.bootstraps;

import com.basis.annotations.SelectorAutoHelloWoldAnnotation;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SelectorAutoHelloWoldAnnotation
public class SelectorConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  new SpringApplicationBuilder(SelectorConfigurationBootstrap.class).
                web(WebApplicationType.NONE).
                run(args);
        System.out.println(context.getBean("helloWorld", String.class));
        context.close();
    }
}
