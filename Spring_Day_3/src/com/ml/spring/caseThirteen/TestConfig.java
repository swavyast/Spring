package com.ml.spring.caseThirteen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Inside Runtime environment of JDK20
 * 
 * @Autowired(required = false)
 * Output:
 * 1.
 * Default constructor in ClassTwo
 * getClassTwo() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 2.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo() bean
 * Spring Container is ready
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.ml.spring.caseThirteen.AppConfig.class);
	System.out.println("Spring Container is ready");
	((ConfigurableApplicationContext)ctx).close();
    }

}
