package com.ml.spring.caseFourteen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.caseEight.AppConfig;
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
 * getClassTwo_() bean
 * Spring Container is ready
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.ml.spring.caseFourteen.AppConfig.class);
	System.out.println("Spring Container is ready");
    }

}
