package com.basis.conditionals;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    /**
     * 系统名称
     * @return
     */
    String name() default "";

    /**
     * 系统属性
     * @return
     */
    String value() default "";
}
