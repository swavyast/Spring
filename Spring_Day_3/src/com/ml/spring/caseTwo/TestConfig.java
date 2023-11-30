package com.ml.spring.caseTwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Inside Runtime environment of JDK20
 * @Autowired(required = true)
 * @Bean("one") of Type ClassOne
 * @Bean("two") of Type ClassTwo
 * Output :
 * 1.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * Spring container is ready
 * */
public class TestConfig {

    public static void main(String[] args) {
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("\n\nSpring container is ready");
    }

}
