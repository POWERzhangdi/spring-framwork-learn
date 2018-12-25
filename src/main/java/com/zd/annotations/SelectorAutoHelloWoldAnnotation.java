package com.zd.annotations;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SelectorHelloWorldConfiguration.class)
public @interface SelectorAutoHelloWoldAnnotation {

}
