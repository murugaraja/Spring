package com.mkyong.output;
 
import com.mkyong.output.IOutputGenerator;
 
public class OutputHelper1
{
	IOutputGenerator outputGenerator;
 
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
 
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
}