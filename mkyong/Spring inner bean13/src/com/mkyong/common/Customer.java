package com.mkyong.common;
 
public class Customer 
{
	private Person person;
 
	public Customer(Person person) {
		this.person = person;
	}
 
	public void setPerson(Person person) {
		this.person = person;
	}
 
	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}
}

class Person 
{
	private String name;
	private String address;
	private int age;
 
	//getter and setter methods
 
	@Override
	public String toString() {
		return "Person [address=" + address + ", age=" + age + ", name=" + name + "]";
	}	
}