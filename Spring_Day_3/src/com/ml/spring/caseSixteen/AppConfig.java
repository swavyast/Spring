package com.ml.spring.caseSixteen;

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
    @Bean
    public ClassTwo getClassTwo_One() {
	ClassTwo two = new ClassTwo();
	System.out.println("getClassTwo_One() bean");
	return two;
    }
    @Bean("someName")
    public ClassTwo getClassTwo_Two() {
	ClassTwo two = new ClassTwo();
	System.out.println("getClassTwo_Two() bean");
	return two;
    }
}