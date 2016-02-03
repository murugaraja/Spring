package com.mkyong.output;
 
import com.mkyong.output.IOutputGenerator;
import com.mkyong.output.impl.CsvOutputGenerator;
 
public class OutputHelper
{
	IOutputGenerator outputGenerator;
 
	public OutputHelper(){
		outputGenerator = new CsvOutputGenerator();
	}
 
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
 
}