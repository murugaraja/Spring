package com.mkyong.output;

import com.mkyong.output.IOutputGenerator;

public class OutputHelperSetter
{
	IOutputGenerator outputGenerator;
	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IOutputGenerator getOutputGenerator() {
		return outputGenerator;
	}
	
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
}