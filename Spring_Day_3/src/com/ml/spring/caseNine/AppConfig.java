package com.ml.spring.caseNine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ml.spring.ClassOne;
import com.ml.spring.ClassTwo;

@Configuration
public class AppConfig {
    @Bean
    public ClassOne getClassOne(ClassTwo two) { //Dependency
	ClassOne one = new ClassOne();
	one.setTwo(two);
	String msg = "Bean of ClassOne";
	return one;
    }

    @Bean(name = "two", autowireCandidate = false) //changed autowireCandidate = true to false
    public ClassTwo getClassTwo() {
	ClassTwo two = new ClassTwo();
	System.out.println("getClassTwo() bean");
	String msg = "Bean of ClassTwo";
	return two;
    }

    @Bean(name = "two", autowireCandidate = false)
    public ClassTwo getClassTwo_() {
	ClassTwo two_ = new ClassTwo(); //this ref. variable was named two in case five
	System.out.println("getClassTwo_() bean");
	String msg = "Bean of ClassTwo";
	return two_;
    }
}