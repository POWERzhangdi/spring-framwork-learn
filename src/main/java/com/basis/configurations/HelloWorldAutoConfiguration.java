package com.basis.configurations;

import com.basis.annotations.SelectorAutoHelloWoldAnnotation;
import com.basis.conditionals.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@Configuration//模式注解
@SelectorAutoHelloWoldAnnotation//模块装配
@ConditionalOnSystemProperty(name = "user.name",value = "PowerZzzD")//条件装配 profile的本质是 condition接口
public class HelloWorldAutoConfiguration {

}
