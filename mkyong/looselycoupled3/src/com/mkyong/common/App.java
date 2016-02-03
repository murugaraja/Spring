package com.mkyong.common;
 
import com.mkyong.output.IOutputGenerator;
import com.mkyong.output.impl.CsvOutputGenerator;
 
public class App 
{
    public static void main( String[] args )
    {
    	IOutputGenerator output = new CsvOutputGenerator();
    	output.generateOutput();
    }
}