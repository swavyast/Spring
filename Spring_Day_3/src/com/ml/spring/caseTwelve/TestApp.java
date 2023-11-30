package com.ml.spring.caseTwelve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseEight.AppConfig;

/**
 * Inside Runtime environment of JDK20
 * 
 * @Autowired(required = false)
 * Output:
 * 1.
 * Default constructor in ClassTwo
 * getClassTwo() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 2.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo() bean
 * Spring Container is ready
 * */
public class TestApp {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.ml.spring.caseTwelve.AppConfig.class);
	System.out.println("Spring Container is ready");

    }

}
