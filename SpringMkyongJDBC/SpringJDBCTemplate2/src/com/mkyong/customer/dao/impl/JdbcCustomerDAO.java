package com.mkyong.customer.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;
import com.mkyong.customer.model.CustomerRowMapper;

public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO
{
	public void insert(Customer customer){
		String sql = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		getJdbcTemplate().update(sql, new Object[] { customer.getCustId(),customer.getName(),customer.getAge()});
	}
	
	public void insertNamedParameter(Customer customer){
	}
	
	public void insertBatch(final List<Customer> customers){
		String sql = "INSERT INTO CUSTOMER " +"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Customer customer = customers.get(i);
				ps.setLong(1, customer.getCustId());
				ps.setString(2, customer.getName());
				ps.setInt(3, customer.getAge() );
			}
			
			@Override
			public int getBatchSize() {
				return customers.size();
			}
		});
	}

	public void insertBatchNamedParameter(final List<Customer> customers){
	}	
	
	public void insertBatchNamedParameter2(final List<Customer> customers){
	}	
	
	public void insertBatchSQL(final String sql){
		getJdbcTemplate().batchUpdate(new String[]{sql});
	}
	
	public Customer findByCustomerId(int custId){
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		Customer customer = (Customer)getJdbcTemplate().queryForObject(sql, new Object[] { custId }, new CustomerRowMapper());
		return customer;
	}
	
	public Customer findByCustomerId2(int custId){
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		Customer customer = (Customer)getJdbcTemplate().queryForObject(sql, new Object[] { custId },new BeanPropertyRowMapper(Customer.class));
		return customer;
	}
	
	public List<Customer> findAll(){
		String sql = "SELECT * FROM CUSTOMER";
		List<Customer> customers = new ArrayList<Customer>();
		List<Map> rows = getJdbcTemplate().queryForList(sql);
		for (Map row : rows) {
			Customer customer = new Customer();
			customer.setCustId((Integer)(row.get("CUST_ID")));
			customer.setName((String)row.get("NAME"));
			customer.setAge((Integer)row.get("AGE"));
			customers.add(customer);
		}
		return customers;
	}
	
	public List<Customer> findAll2(){
		String sql = "SELECT * FROM CUSTOMER";
		List<Customer> customers  = getJdbcTemplate().query(sql,new BeanPropertyRowMapper(Customer.class));
		return customers;
	}
	
	public String findCustomerNameById(int custId){
		String sql = "SELECT NAME FROM CUSTOMER WHERE CUST_ID = ?";
		String name = (String)getJdbcTemplate().queryForObject(sql, new Object[] { custId }, String.class);
		return name;
	}
	
	public int findTotalCustomer(){
		String sql = "SELECT COUNT(*) FROM CUSTOMER";
		int total = getJdbcTemplate().queryForInt(sql);
		return total;
	}
}