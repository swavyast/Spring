package com.ml.spring.caseTwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.ClassOne;
import com.ml.spring.ClassTwo;

public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("\n\nSpring container is ready");
    }

}
