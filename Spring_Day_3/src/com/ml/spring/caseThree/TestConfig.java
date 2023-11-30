package com.ml.spring.caseThree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Inside Runtime environment of JDK20
 * @Autowired(required = true)
 * @Bean("one") of Type ClassOne
 * @Bean("changed") of Type ClassTwo
 * Output is :
 * Default constructor in ClassTwo
 * Default constructor in ClassOne 
 * Spring container is ready
 * 
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("\n\nSpring container is ready");

    }

}
