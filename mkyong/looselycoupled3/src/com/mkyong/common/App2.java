package com.mkyong.common;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.output.OutputHelper1;
 
public class App2 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml"});
 
    	OutputHelper1 output = (OutputHelper1)context.getBean("OutputHelper");
    	output.generateOutput();
 
    }
}