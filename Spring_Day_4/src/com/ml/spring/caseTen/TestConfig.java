package com.ml.spring.caseTen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Inside Runtime environment of JDK20
 * CaseTen :
 * @Autowired(required = true)
 * @Qualifier("someName")
 * Bean("someName") of ClassTwo
 * Bean("two") of ClassTwo. same as field name.
 * Output :
 * 1.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 2.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready
 * 3.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Spring Container is ready
 * 4.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Spring Container is ready
 * 5.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.ml.spring.caseTen.AppConfig.class);
	System.out.println("Spring Container is ready");
	((ConfigurableApplicationContext)ctx).close();
    }
}
