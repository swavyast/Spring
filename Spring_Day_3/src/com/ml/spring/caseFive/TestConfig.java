package com.ml.spring.caseFive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Inside Runtime environment of JDK20
 * @Autowired(required = true)
 * @Bean of Type ClassOne
 *  No bean of Type ClassTwo
 *  Output:
 *  1.
 *  Default constructor in ClassOne
 *  Error creating bean with name 'getClassOne' defined in com.ml.spring.caseFive.AppConfig: 
 *  Unsatisfied dependency expressed through method 'getClassOne' parameter 0; 
 *  nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: 
 *  No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected at least 1 bean which qualifies as autowire candidate.
 *  Dependency annotations: {}
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.ml.spring.caseFive.AppConfig.class);
	System.out.println("\n\nSpring container is ready");
	((ConfigurableApplicationContext)ctx).close();
    }

}
