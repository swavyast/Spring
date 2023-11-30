package com.ml.spring.caseSeven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseThree.AppConfig;

/**
 * Inside Runtime environment of JDK20
 * 
 * @Autowired(required = true)
 * Output:
 * 1.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * changed,getClassTwo_One
 * 2.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * changed,getClassTwo_One
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * changed,getClassTwo_One
 * 4.
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * changed,getClassTwo_One
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.ml.spring.caseSeven.AppConfig.class);
	System.out.println("\n\nSpring container is ready");
    }

}
