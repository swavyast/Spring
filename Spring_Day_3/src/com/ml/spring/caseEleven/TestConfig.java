package com.ml.spring.caseEleven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseEight.AppConfig;
/**
/**
 * Inside Runtime environment of JDK20
 * 
 * @Autowired(required = false)
 * Output:
 * 1.
 * Default constructor in ClassOne
 * Spring Container is ready
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.ml.spring.caseEleven.AppConfig.class);
	System.out.println("Spring Container is ready");
    }

}
