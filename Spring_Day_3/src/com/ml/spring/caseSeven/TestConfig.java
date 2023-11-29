package com.ml.spring.caseSeven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseThree.AppConfig;

/**
 * Inside Runtime environment of JDK20
 * 
 * Issue remains the same even after manipulating autowiring.
 * 
 * Conclusion : no matter what, spring container is going to have only one bean per Type.
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("\n\nSpring container is ready");	//unreachable code
	ctx.getBean("two");	//unreachable code
    }

}
