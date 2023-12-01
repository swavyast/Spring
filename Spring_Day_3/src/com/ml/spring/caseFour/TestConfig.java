package com.ml.spring.caseFour;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Inside Runtime environment of JDK20
 * @Autowired(required = true)
 * @Bean of Type ClassOne
 * @Bean of Type ClassTwo
 * @Bean of Type ClassTwo
 * Output:
 * 1.Error creating bean with name 'getClassOne' defined in com.ml.spring.caseFour.AppConfig: 
 * Unsatisfied dependency expressed through method 'getClassOne' parameter 0; 
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: 
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * getClassTwo_One,getClassTwo_Two
 * 2.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * 1.Error creating bean with name 'getClassOne' defined in com.ml.spring.caseFour.AppConfig: 
 * Unsatisfied dependency expressed through method 'getClassOne' parameter 0; 
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: 
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * getClassTwo_One,getClassTwo_Two
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Unsatisfied dependency expressed through method 'getClassOne' parameter 0; 
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: 
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * getClassTwo_One,getClassTwo_Two
 * 4.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Unsatisfied dependency expressed through method 'getClassOne' parameter 0; 
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: 
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * getClassTwo_One,getClassTwo_Two
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.ml.spring.caseFour.AppConfig.class);
	System.out.println("\n\nSpring container is ready");
	((ConfigurableApplicationContext)ctx).close();
    }

}
