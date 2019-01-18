package com.basis.annotations;


import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * 二级 {@link Repository}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@MyOneCustomAnnotation
public @interface MyTwoCustomAnnotation {

    String value() default "";

}
