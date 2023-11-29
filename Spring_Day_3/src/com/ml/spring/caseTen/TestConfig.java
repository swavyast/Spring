package com.ml.spring.caseTen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseEight.AppConfig;

/**
 * Inside Runtime environment of JDK20
 * 
 * Problem remains same even after removing autowireCandidates. 
 * 
 * Sometimes it's able to find "getClassTwo() bean" and works fine.
 * 
 * Sometimes it's picking getClassTwo_() bean and throwing error.
 * 
 * Sometimes it's not able to decide at all and throws error only.
 * 
 * */
public class TestConfig {
    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("Spring Container is ready");
    }
}
