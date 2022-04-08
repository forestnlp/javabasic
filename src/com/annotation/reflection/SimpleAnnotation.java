package com.annotation.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/8 - 04 - 08 - 11:32
 * @Description: com.annotation.reflection
 * @version: 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimpleAnnotation {
    public String title() default "";
    public String description() default "";
}
