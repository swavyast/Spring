package com.ml.spring.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ml.spring.util.CustomerRowMapper;
import com.ml.spring.dao.CustomerDAO;
import com.ml.spring.pojo.Customer;

@Repository("customerDAO")
public class CustomerDaoImpl implements CustomerDAO {

	@Autowired
	JdbcTemplate jtemp;

	@Override
	public void addCustomer(Customer c) {
		String sql = "insert into mycustomer(cname, email, phone, city) values(?,?,?,?)";
		jtemp.update(sql, c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
	}

	@Override
	public List<Customer> getCustomerById(long cid) {
		String sql = "select * from mycustomer where cid = ?";
		List<Customer> clist = jtemp.query(sql, new CustomerRowMapper(), cid);
		return clist;
	}
	
	public Customer getCustomerByName(String cname) {
		String sql = "select * from mycustomer where cname = ?";
		Customer cl = (Customer) jtemp.query(sql, new CustomerRowMapper(), cname);
		return cl;
	}

	@Override
	public List<Customer> getAllCustomers() {
		String sql = "select * from mycustomer";
		List<Customer> clist = jtemp.query(sql, new CustomerRowMapper());
		return clist;
	}

	@Override
	public void updateCustomer(Customer c) {
		String sql = "update mycustomer set cid=?, cname = ?, email = ?, phone = ?, city = ? where cid = ?";
		jtemp.update(sql, c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity(), c.getCid());	
	}

	@Override
	public void deleteCustomer(long cid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(String cname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(Customer c) {
		// TODO Auto-generated method stub
		
	}
	
}
