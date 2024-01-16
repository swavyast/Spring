package com.ml.spring.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ml.spring.config.AppConfiguration;
import com.ml.spring.dao.CustomerDAO;
import com.ml.spring.pojo.Customer;

public class MyClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("customerDAO");
		//Customer c = new Customer(1, "Himanshu", "swavyast@gmail.com", "+91-9889873569", "Noida");
		Customer c1 = new Customer("Hemant Kumar Rai", "hemantr@hotmail.com", "7318305031", "Kasganj");
		cdao.addCustomer(c1);
		//cdao.updateCustomer((Customer) cdao.getCustomerByName(c1.getCname()));
		List<Customer> clist = cdao.getAllCustomers();
		clist.forEach((cust)->System.out.println(cust));
		List<Customer> cl2 = cdao.getCustomerById(1);
		cl2.forEach((cl)->System.out.println(cl));
	}

}
