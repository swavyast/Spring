package com.ml.spring.caseEight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.ClassOne;
import com.ml.spring.ClassTwo;

/**
 * Inside Runtime environment of JDK20
 * 
 * @Autowired(required = true)
 * Output:
 * 1.
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: changed,bothChanged
 * 2.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: bothChanged, changed
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: bothChanged, changed
 * 4.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: bothChanged, changed
 * 5.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: changed, bothChanged
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("Spring Container is ready");
    }

}
