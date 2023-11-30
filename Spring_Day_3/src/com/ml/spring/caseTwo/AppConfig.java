package com.ml.spring.caseTwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ml.spring.ClassOne;
import com.ml.spring.ClassTwo;

@Configuration
public class AppConfig {
    
    @Bean("one")
    public ClassOne getClassOne() {
	ClassOne one = new ClassOne();
	return one;
    }
    @Bean("two")
    public ClassTwo getClassTwo() {
	ClassTwo two = new ClassTwo();
	return two;
    }
}
