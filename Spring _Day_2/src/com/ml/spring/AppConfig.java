package com.ml.spring;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("myEmails")
    public List<String> getEmails() {
	System.out.println("\n\nBean named \"myEmails\" is loaded");
	List<String> emails = new ArrayList<String>();
	emails.add("abc@gmail.com");
	emails.add("xyz@gmail.com");
	return emails;
    }

    @Bean("myPhones")
    public Set<Long> getPhones() {
	System.out.println("\n\nBean named \"myPhones\" is loaded");
	Set<Long> phones = new TreeSet<Long>();
	phones.add(9898989898L);
	phones.add(9999999999L);
	return phones;
    }

    @Bean(name = "myprops", autowireCandidate = false)
    public Properties getProps() {
	System.out.println("\n\nBean named \"myProps\" is loaded");
	Properties myprops = new Properties();
	myprops.put("A", 1223);
	myprops.put("B", 387836);
	myprops.put("C", 383887);
	myprops.put("D", 38376);
	myprops.put("E", 4847);
	return myprops;
    }

    @Bean("myRefs")
    public Map<String, Integer> getRefs() {
	System.out.println("\n\nBean named \"myRefs\" is loaded");
	Map<String, Integer> refs = new TreeMap<String, Integer>();
	refs.put("Someone", 9878);
	refs.put("Someone Else", 987868);
	return refs;
    }

    @Bean("myAddress")
    public Address getAddress() {
	System.out.println("\n\nBean named \"myAddress\" is loaded");
	Address address = new Address();
	address.setStreet("E-7");
	address.setLocality("Sector-17");
	address.setCity("Gurugram");
	address.setState("Haryana");
	address.setCountry("India");
	address.setPincode(201509);
	return address;
    }

    @Bean("myAccounts")
    public List<Account> getAccounts() {
	System.out.println("\n\nBean named \"myAccounts\" is loaded");
	//Account 1
	Map<LocalDateTime, Double> deposit = new Hashtable<LocalDateTime, Double>();
	deposit.put(LocalDateTime.now(), 12000d);
	Map<LocalDateTime, Double> withdrawl = new Hashtable<LocalDateTime, Double>();
	withdrawl.put(LocalDateTime.now(), 1200d);
	Account ac1 = new Account();
	ac1.setAcNo(110022001036L);
	ac1.setAcType("Saving Account");
	ac1.setBalance(55000d);
	ac1.setDeposits(deposit);
	ac1.setWithdrawls(withdrawl);

	//Account 2
	Map<LocalDateTime, Double> deposit2 = new Hashtable<LocalDateTime, Double>();
	deposit2.put(LocalDateTime.now(), 1200d);
	Map<LocalDateTime, Double> withdrawl2 = new Hashtable<LocalDateTime, Double>();
	withdrawl2.put(LocalDateTime.now(), 12000d);
	Account ac2 = new Account();
	ac2.setAcNo(110022001098L);
	ac2.setAcType("Current Account");
	ac2.setBalance(56000d);
	ac2.setDeposits(deposit2);
	ac2.setWithdrawls(withdrawl2);

	List<Account> accounts = new ArrayList<Account>();
	accounts.add(ac1);
	accounts.add(ac2);
	return accounts;
    }

    @Bean("myCust")
    public Customer createCustomer(List<String> emails, Set<Long> phones, Properties myprops, Map<String, Integer> refs,
	    Address address, List<Account> accounts) {
	System.out.println("\n\nBean named \"myCust\" is loaded");
	Customer customer1 = new Customer(1010101L, "Customer One", 7673767378L, "mno@pqr.com");
	/*
	 * customer1.setCid(1010101L); customer1.setCname("Customer One");
	 * customer1.setCemail("mno@pqr.com"); customer1.setCphone(7673767378L);
	 */
	//constructor arguments

	customer1.setEmails(emails);
	customer1.setPhones(phones);
	customer1.setRefs(refs);
	customer1.setAddress(address);
	customer1.setAccounts(accounts);
	customer1.setProps(myprops);
	System.out.println();
	return customer1;
    }
}
