package com.ml.spring;

import java.util.List;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfiguration {

    public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("\n\nContainer is ready...\n\n");
	Customer cust = (Customer) context.getBean("myCust");
	System.out.println(cust);
	Properties p = (Properties) context.getBean("myprops");
	System.out.println("\n\n"+p.get("A"));
	System.out.println(p.get("B"));
	System.out.println(p.get("C"));
	System.out.println(p.get("D"));
	System.out.println(p.get("E"));
	@SuppressWarnings("unchecked")
	List<Account> a = (List<Account>) context.getBean("myAccounts");
	for (Account account : a) {
	    System.out.println("\n\n"+account.toString());   
	}
	Account a1 = a.get(0);
	System.out.println("\n\nDeposits in account a1 : "+a1.getDeposits().keySet()+" : "+a1.getDeposits().values());
	System.out.println("\n\nWithdrawl from account a1 : "+a1.getWithdrawls().keySet()+" : "+a1.getWithdrawls().values());
	((ConfigurableApplicationContext)context).close();
    }

}
