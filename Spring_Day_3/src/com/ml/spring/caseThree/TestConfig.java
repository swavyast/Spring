package com.ml.spring.caseThree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Inside Runtime environment of JDK20
 * 
 * prints : Default constructor in ClassTwo, sometimes once, sometimes twice and sometimes not at all and the error following
 * this print statement is
 * Error creating bean with name 'getClassOne' defined in com.ml.spring.caseThree.AppConfig: Unsatisfied 
 * dependency expressed through method 'getClassOne' parameter 0; 
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: 
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * getClassTwo_,getClassTwo
 * 
 * "Spring Container is ready" print statement is not printing at all
 * 
 * Inside Runtime environment of JDK11
 * Output is :
 * Default constructor in ClassTwo
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * 
 * 
 * Spring container is ready
 * 
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("\n\nSpring container is ready");	//unreachable code

    }

}
