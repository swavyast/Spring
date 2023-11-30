package com.ml.spring.caseNine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseEight.AppConfig;

/**
 * Inside Runtime environment of JDK20
 * 
 * @Autowired(required = true)
 * Output:
 * 1.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready
 * 2.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Spring Container is ready
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 4.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 5.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.ml.spring.caseNine.AppConfig.class);
	System.out.println("Spring Container is ready");
    }

}