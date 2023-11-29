package com.ml.spring.caseNine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseEight.AppConfig;
/**
 * Problem still remains the same as caseEight, even after manipulating autowireCandidate in AppConfig.
 * 
 * that means, problem is not with autowiring here.
 * 
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("Spring Container is ready");
    }

}