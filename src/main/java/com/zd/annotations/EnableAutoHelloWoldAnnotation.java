package com.zd.annotations;

import com.zd.beans.HelloWorldConfiguration;
import com.zd.configurations.HelloWorldAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 注解实现 @Enable
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloWorldConfiguration.class)
public @interface EnableAutoHelloWoldAnnotation {

}
