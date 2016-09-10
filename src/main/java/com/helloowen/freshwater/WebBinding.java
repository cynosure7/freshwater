package com.helloowen.freshwater;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface WebBinding {
    enum Type {Component, CssAttribute, CssClasses}

    Type type() default Type.Component;

    String value() default "";

    String css() default "";

    String attribute() default "";

    int index() default 0;
}