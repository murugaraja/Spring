package com.mkyong.common;
 
public class Customer 
{
	private Person person;
	private int type;
	private String action;
 
	@Mandatory
	public void setPerson(Person person) {
		this.person = person;
	}
	//getter and setter methods
}