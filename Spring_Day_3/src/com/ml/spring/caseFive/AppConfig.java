package com.ml.spring.caseFive;

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
}
