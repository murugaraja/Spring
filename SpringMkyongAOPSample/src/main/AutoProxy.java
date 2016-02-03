package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import customer.services.CustomerService;
public class AutoProxy 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext(new String[] {"Spring-CustomerAutoProxy.xml"});
	
    	CustomerService cust = (CustomerService)appContext.getBean("customerService");
    	
    	System.out.println("*************************");
    	cust.printName();
    	System.out.println("*************************");
    	cust.printURL();
    	System.out.println("*************************");
    	try{
    		cust.printThrowException();
    	}catch(Exception e){
    		
    	}
    	
    }
}
