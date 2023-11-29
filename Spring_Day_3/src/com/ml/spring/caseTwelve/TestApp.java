package com.ml.spring.caseTwelve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseEight.AppConfig;

/**
 * autowire = Autowire.BY_NAME (didn't work)
 * */
public class TestApp {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("Spring Container is ready");

    }

}
