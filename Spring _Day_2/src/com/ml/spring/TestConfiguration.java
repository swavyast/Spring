package com.ml.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfiguration {

    public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("\n\nContainer is ready...");

    }

}
