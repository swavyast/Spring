package com.ml.spring.caseEleven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseEight.AppConfig;
/**
 * Problem remains the same, even after renaming second bean.
 * 
 * Let's check if autowiring works in this case.
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("Spring Container is ready");
    }

}
