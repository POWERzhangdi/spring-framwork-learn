package com.basis.bootstraps;


import com.basis.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 这里为什么跟前面启动的学习不一样是因为
 * @SpringBootApplication 里面 包含了 @ComponentScan 这就是前面的派生性
 * 也是一个 组合注解 也就是 @Enable模式的注解
 *
 */
@SpringBootApplication(scanBasePackages = "com.basis.service")
public class CalculateBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateBootStrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java7")
                .run(args);

        CalculateService calculateService = context.getBean(CalculateService.class);
        System.out.println(calculateService.sum(1,2,3,4,5,6,7,8,9,10));
        context.close();
    }


}
