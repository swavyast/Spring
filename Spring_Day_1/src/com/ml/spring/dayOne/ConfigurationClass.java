package com.ml.spring.dayOne;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationClass {

    @Bean("one")
    public ClassOne getClassOne() {

	//The constructor ClassOne() is not visible
	//ClassOne one=new ClassOne();
	ClassOne one = ClassOne.getClassOne();

	return one;
    }

    @Bean
    public ClassTwo getClassTwo() {

	ClassTwo two = new ClassTwo();

	return two;
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ClassThree getClassThree() {

	ClassThree three = new ClassThree("Spring Starter Project");

	return three;
    }
    
    @Bean("four")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ClassFour getClassFour() {
	ClassFour four = new ClassFour(101, "hello world", 23);
	
	return four;
    }
}
