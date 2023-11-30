package com.ml.spring.caseSix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseThree.AppConfig;

/**
 * Inside Runtime environment of JDK20
 * 
 * Output:
 * 1.
 * @Autowired(required = true)
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * 
 * (Order of constructor call may differ in different variations of outputs)
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.ml.spring.caseSix.AppConfig.class);
	System.out.println("\n\nSpring container is ready");	//unreachable code

    }

}
