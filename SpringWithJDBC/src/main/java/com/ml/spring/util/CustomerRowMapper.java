package com.ml.spring.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ml.spring.pojo.Customer;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer c = new Customer();
		c.setCid(rs.getLong(1));
		c.setCname(rs.getString(2));
		c.setEmail(rs.getString(3));
		c.setPhone(rs.getString(4));
		c.setCity(rs.getString(5));
		return c;
	}

}
