package com.ml.spring.caseEight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.ClassOne;
import com.ml.spring.ClassTwo;

/**
 * Inside Runtime environment of JDK20
 * 
 * Now it is working fine(not completely though). Some changes can be seen in AppConfig class. One line of code(one.setTwo(two);)
 * has been added after : ClassOne one = new ClassOne();
 * which means, now container knows that I have to pick a bean named "two" as ClassOne's dependency.
 * In previous cases(with name, without name, same name or different name and different reference inside same or different bean,
 * problem was same) container was not able to decide which dependency is to be injected. It was getting 2 beans for the same
 * class, ClassTwo and none was qualified as per the container's knowledge.
 * 
 * But, which bean exactly it is pointing to, now? (we have 2 beans with same name "two" but it's still working fine)
 * 
 * No, it's still not working fine exactly.
 * 
 *  Sometimes it shows output as :
 *  
 *  Default constructor in ClassTwo
 *  getClassTwo() bean
 *  Default constructor in ClassOne
 *  Spring Container is ready
 * 
 * Sometimes it throws error, without printing anything at all.
 * 
 * Sometimes it prints only :
 * 
 * Default constructor in ClassTwo
 * getClassTwo_() bean
 * and then a huge error log stating "Unsatisfied dependency expressed"
 * 
 * Error creating bean with name 'getClassOne' defined in com.ml.spring.caseEight.AppConfig: Unsatisfied dependency expressed 
 * through method 'getClassOne' parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: 
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected at least 1 bean which qualifies as autowire candidate.
 * Dependency annotations: {}
 * 
 * In next case, we'll examine the same sort of experiments(changing names and autowiring flags) for caseEight AppConfig.
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("Spring Container is ready");	//sometimes it's reachable, sometimes it's not.
	/*
	 * ClassTwo two = (ClassTwo) ctx.getBean("two");
	 * System.out.println(two.getId()); System.out.println(two.getName());
	 * System.out.println(two); ClassOne one = (ClassOne) ctx.getBean("one");
	 * System.out.println(one);
	 */
    }

}
