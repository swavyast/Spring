package com.ml.spring.caseOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Inside Runtime environment of JDK20
 * @Autowired(required = true)
 * @Bean of Type ClassOne(without name)
 * @Bean of Type ClassTwo(without name)
 * 
 * Output:
 * 1.
 * Default constructor in ClassTwo
 * Default constructor in ClassOne
 * Spring container is ready
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("\n\nSpring container is ready");
	((ConfigurableApplicationContext)ctx).close();
    }

}
