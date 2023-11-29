package com.ml.spring.caseSeven;

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

    @Bean(name = "two", autowireCandidate = true)
    public ClassTwo getClassTwo() {
	ClassTwo two = new ClassTwo();
	String msg = "Bean of ClassTwo";
	return two;
    }

    @Bean(name = "two_", autowireCandidate = false)
    public ClassTwo getClassTwo_() {
	ClassTwo two_ = new ClassTwo(); //this ref. variable was named two in case five
	System.out.println("getClassTwo_() bean");
	String msg = "Bean of ClassTwo";
	return two_;
    }
}
