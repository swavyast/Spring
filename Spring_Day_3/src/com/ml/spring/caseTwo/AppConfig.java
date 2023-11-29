package com.ml.spring.caseTwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ml.spring.ClassOne;
import com.ml.spring.ClassTwo;

@Configuration
public class AppConfig {
    @Bean
    public ClassTwo getClassTwo() {
	ClassTwo two = new ClassTwo();
	String msg = "Bean of ClassTwo";
	return two;
    }
    @Bean	//this bean was named in caseOne
    public ClassOne getClassOne(ClassTwo two) { //Dependency
	ClassOne one = new ClassOne();
	String msg = "Bean of ClassOne";
	return one;
    }
}
