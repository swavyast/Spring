package com.ml.spring.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"com.ml.spring"})
public class AppConfiguration {
	@Bean("dataSource")
	public DataSource getDataSource() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/testdb");
		bds.setUsername("root");
		bds.setPassword("68921794");
		bds.setMaxActive(5);
		return bds;
	}
	@Bean("jtemp")
	public JdbcTemplate getTemplate(DataSource ds) {
		JdbcTemplate jtemp = new JdbcTemplate(ds);
		return jtemp;
	}

}
