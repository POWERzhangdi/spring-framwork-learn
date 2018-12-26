package com.zd.configurations;

import com.zd.annotations.SelectorAutoHelloWoldAnnotation;
import com.zd.conditionals.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@Configuration//模式注解
@SelectorAutoHelloWoldAnnotation//模块装配
@ConditionalOnSystemProperty(name = "user.name",value = "PowerZzzD")//条件装配
public class HelloWorldAutoConfiguration {

}
