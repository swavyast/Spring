package com.ml.spring.dao;

import java.util.List;

import com.ml.spring.pojo.Customer;

public interface CustomerDAO {

	public void addCustomer(Customer c);
	public List<Customer> getCustomerById(long cid);
	public Customer getCustomerByName(String cname);
	public List<Customer> getAllCustomers();
	public void updateCustomer(Customer c);
	public void deleteCustomer(long cid);
	public void deleteCustomer(String cname);
	public void deleteCustomer(Customer c);
}
