package com.ml.spring.dao;

import java.util.List;

import com.ml.spring.pojo.Customer;

public interface CustomerDAO {

	public boolean addCustomer(Customer c);
	public Customer getCustomerById(long cid);
	public List<Customer> getAllCustomers();
	public boolean updateCustomer(Customer c);
	public boolean deleteCustomer(long cid);
	public boolean deleteCustomer(String cname);
	public boolean deleteCustomer(Customer c);
}
