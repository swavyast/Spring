package com.ml.spring.caseSix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseThree.AppConfig;

/**
 * Inside Runtime environment of JDK20
 * 
 * Issue remains the same as caseThree and CaseFour and caseFive even after renaming the reference of 
 * ClassTwo inside getClassTwo_ bean
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("\n\nSpring container is ready");	//unreachable code

    }

}
