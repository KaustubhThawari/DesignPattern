package com.strategy.design.pattern;

public class DivOperation implements Strategy {

	@Override
	public Integer doOpreation(Integer num1, Integer num2) {
		if(num1 > num2) {
			return num1 / num2;	
		}
		return num2 / num1;
	}

}
