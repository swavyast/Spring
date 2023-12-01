package com.ml.spring.caseOne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ml.spring.ClassOne;
import com.ml.spring.ClassTwo;

@Configuration
public class AppConfig {
    @Bean
    public ClassTwo getClassTwo() {
	ClassTwo two = new ClassTwo();
	return two;
    }
    @Bean
    public ClassOne getClassOne(ClassTwo two) {
	ClassOne one = new ClassOne();
	return one;
    }
}
