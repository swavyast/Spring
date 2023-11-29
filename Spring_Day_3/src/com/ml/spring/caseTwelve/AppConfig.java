package com.ml.spring.caseTwelve;

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
	one.setTwo(two);
	String msg = "Bean of ClassOne";
	return one;
    }

    @Bean(name = "two", autowire = Autowire.BY_NAME)
    public ClassTwo getClassTwo() {
	ClassTwo two = new ClassTwo();
	System.out.println("getClassTwo() bean");
	String msg = "Bean of ClassTwo";
	return two;
    }

    @Bean(name = "two_")	//autowireCandidate attribute has been removed from here and name as well has been changed.
    public ClassTwo getClassTwo_() {
	ClassTwo two_ = new ClassTwo(); //this ref. variable was named two in case five
	System.out.println("getClassTwo_() bean");
	String msg = "Bean of ClassTwo";
	return two_;
    }
}