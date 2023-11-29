package com.ml.spring.caseFour;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ml.spring.ClassOne;
import com.ml.spring.ClassTwo;

@Configuration
public class AppConfig {
    @Bean
    public ClassOne getClassOne(ClassTwo two) { //Dependency
	ClassOne one = new ClassOne();
	System.out.println("getClassTwo() bean");
	String msg = "Bean of ClassOne";
	return one;
    }
    @Bean("two")	//this bean was unnamed in caseThree
    public ClassTwo getClassTwo() {
	ClassTwo two = new ClassTwo();
	String msg = "Bean of ClassTwo";
	return two;
    }
    
    @Bean("two")	//this bean was unnamed in caseThree
    public ClassTwo getClassTwo_() {
	ClassTwo two = new ClassTwo();
	System.out.println("getClassTwo_() bean");
	String msg = "Bean of ClassTwo";
	return two;
    }
}
