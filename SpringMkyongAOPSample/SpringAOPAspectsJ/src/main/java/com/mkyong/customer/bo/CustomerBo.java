package com.mkyong.customer.bo;

public interface CustomerBo {

	String addCustomer();
	
	String addCustomerReturnValue();
	
	void addCustomerThrowException() throws Exception;
	
	void addCustomerAround(String name);
}