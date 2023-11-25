package com.ml.spring.dayOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfiguration {

    public static void main(String[] args) {

	System.out.println("___________________________________________");
	System.out.println("**** Main method inside TestConfiguration ****");
	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
	System.out.println("**** Container started ****");

	ClassOne one = (ClassOne) context.getBean("one");
	System.out.println(one);

	/*
	 * ClassOne one_ = (ClassOne) context.getBean("getClassOne");
	 * System.out.println(one_);
	 * 
	 * No bean named 'getClassOne' available
	 */

	ClassOne _one = context.getBean(ClassOne.class);
	System.out.println(_one);
	System.out.println("___________________________________________");
	System.out.println(one == _one); //true, that means a bean can be accessed in both ways, either by using bean name or
					//by using it's class name.
	System.out.println("___________________________________________");
	ClassOne one1 = ClassOne.getClassOne();
	ClassOne one2 = ClassOne.getClassOne();
	System.out.print("Accessing without context : ");
	System.out.println(one1==one2);
	System.out.println("___________________________________________");
	ClassTwo two = context.getBean(ClassTwo.class);
	System.out.println(" two " + two);
	ClassTwo two_ = context.getBean(ClassTwo.class);
	System.out.println(" two_ " + two_);
	System.out.println("___________________________________________");
	System.out.println(two == two_); //true, because by default, spring context follows singleton design pattern itself.
	System.out.println("___________________________________________");
	ClassThree three = context.getBean(ClassThree.class);
	System.out.println(three);
	ClassThree three_ = (ClassThree) context.getBean("getClassThree");
	System.out.println(three_);
	System.out.println("___________________________________________");
	System.out.println(three == three_); //true
	System.out.println("___________________________________________");
	System.out.println("\n**** Accessing without context here ****\n\n");
	ClassThree three3 = new ClassThree();
	ClassThree three4 = new ClassThree();
	System.out.println("___________________________________________");
	System.out.print("Accessing without context : ");
	System.out.println(three3 == three4);	//false, because CLassThree is not implementing singleton pattern unlike ClassOne.
	System.out.println("___________________________________________");
	ClassFour four = (ClassFour) context.getBean("four");
	ClassFour four_ = (ClassFour) context.getBean("four");
	System.out.println(four==four_); 	//false, because scope has been changed to prototype, hence both instance will be
						//pointing to two different memory locations.
	ConfigurableApplicationContext c=(ConfigurableApplicationContext)context;
	c.close();
    }

}
