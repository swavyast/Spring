package com.ml.spring.caseFourteen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseEight.AppConfig;
/**
 * @Qualifier annotation also doesn't work alone.
 * 
 * Output : 
 * 1:
 * Default constructor in ClassTwo
 * getClassTwo() bean
 * Default constructor in ClassOne
 * Setter method in class one for ClassTwo dependency
 * Spring Container is ready
 * 2:
 * Default constructor in ClassTwo
 * getClassTwo_() bean
 * Error creating bean with name 'getClassOne' defined in com.ml.spring.caseEight.AppConfig: Unsatisfied dependency expressed
 * through method 'getClassOne' parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected at least 1 bean which qualifies as autowire
 * candidate. Dependency annotations: {}
 * 3:
 * Error creating bean with name 'getClassOne' defined in com.ml.spring.caseEight.AppConfig: Unsatisfied dependency expressed
 * through method 'getClassOne' parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected at least 1 bean which qualifies as autowire
 * candidate. Dependency annotations: {}
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("Spring Container is ready");
    }

}
