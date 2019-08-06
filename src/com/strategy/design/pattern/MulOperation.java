package com.strategy.design.pattern;

public class MulOperation implements Strategy {

	@Override
	public Integer doOpreation(Integer num1, Integer num2) {
		return num1 * num2;
	}

}
