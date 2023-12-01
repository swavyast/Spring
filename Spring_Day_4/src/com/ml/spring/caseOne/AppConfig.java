package com.ml.spring.caseOne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ml.spring.ClassOne;

@Configuration
public class AppConfig {
    @Bean
    public ClassOne getClassOne() {
	ClassOne one = new ClassOne();
	return one;
    }
//    @Bean("someName")
//    public ClassTwo getClassTwo_One() {
//	ClassTwo two = new ClassTwo();
//	System.out.println("getClassTwo_One() bean");
//	return two;
//    }
//    @Bean("two")
//    public ClassTwo getClassTwo_Two() {
//	ClassTwo two = new ClassTwo();
//	System.out.println("getClassTwo_Two() bean");
//	return two;
//    }
}