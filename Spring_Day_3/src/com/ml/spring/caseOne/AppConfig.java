package com.ml.spring.caseOne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ml.spring.ClassOne;
import com.ml.spring.ClassTwo;

@Configuration
public class AppConfig {
    
    @Bean("one")
    public ClassOne getClassOne(ClassTwo two) { //Dependency
	ClassOne one = new ClassOne();
	String msg = "Bean of ClassOne";
	return one;
    }
    @Bean("two")
    public ClassTwo getClassTwo() {
	ClassTwo two = new ClassTwo();
	String msg = "Bean of ClassTwo";
	return two;
    }
}
