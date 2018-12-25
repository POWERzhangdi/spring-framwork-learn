package com.zd.annotations;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.lang.annotation.*;


/**
 * 一级
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Repository
public @interface MyOneCustomAnnotation {

    String value() default "" ;

}
