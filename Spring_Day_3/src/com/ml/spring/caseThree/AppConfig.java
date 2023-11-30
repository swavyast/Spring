package com.ml.spring.caseThree;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ml.spring.ClassOne;
import com.ml.spring.ClassTwo;

@Configuration
public class AppConfig {
    @Bean
    public ClassOne getClassOne() {
	ClassOne one = new ClassOne();
	return one;
    }
    @Bean("changed")
    public ClassTwo getClassTwo() {
	ClassTwo two = new ClassTwo();
	return two;
    }
}
