package com.ml.spring.caseFive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseThree.AppConfig;

/**
 * Issue remains the same as caseThree and CaseFour, even after renaming the bean dependencies(one as "two" and another as "two_")
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("\n\nSpring container is ready");	//unreachable code

    }

}
