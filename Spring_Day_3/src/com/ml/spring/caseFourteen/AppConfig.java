package com.ml.spring.caseFourteen;

import org.springframework.beans.factory.annotation.Autowired;
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
    //@Bean(name = "two_", autowireCandidate = true)
    @Bean(name = "two")
    @Autowired(required = true)
    public ClassTwo getClassTwo() {
	ClassTwo two = new ClassTwo();
	System.out.println("getClassTwo() bean");
	String msg = "Bean of ClassTwo";
	return two;
    }
    
   //@Bean(name = "two_", autowireCandidate = false)
    @Bean(name = "two_")
    @Autowired(required = false)
    public ClassTwo getClassTwo_() {
	ClassTwo two_ = new ClassTwo(); //this ref. variable was named two in case five
	System.out.println("getClassTwo_() bean");
	String msg = "Bean of ClassTwo";
	return two_;
    }
}