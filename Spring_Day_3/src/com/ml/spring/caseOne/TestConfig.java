package com.ml.spring.caseOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.ClassOne;
/**
 * Inside Runtime environment of JDK20
 * */
public class TestConfig {

    public static void main(String[] args) {
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("\n\nSpring container is ready");
    }

}
