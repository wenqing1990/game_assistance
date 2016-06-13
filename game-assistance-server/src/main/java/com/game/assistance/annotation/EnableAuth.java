package com.game.assistance.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) //声明为runtime，可在运行时获取到注解
@Documented
public @interface EnableAuth {

    public boolean value() default true;
    
}
