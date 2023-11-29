package com.ml.spring.caseThirteen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseEight.AppConfig;
/**
 * autowireCandidate = true, also didn't work.
 * 
 * what next?
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("Spring Container is ready");

    }

}
