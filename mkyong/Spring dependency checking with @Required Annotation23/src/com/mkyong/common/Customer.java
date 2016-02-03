package com.mkyong.common;
 
import org.springframework.beans.factory.annotation.Required;
 
public class Customer 
{
	private Person person;
	private int type;
	private String action;
 
	public Person getPerson() {
		return person;
	}
	
	@Required
	public void setPerson(Person person) {
		this.person = person;
	}
}