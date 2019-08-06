package com.strategy.design.pattern;

public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public Integer executeOperation(Integer num1, Integer num2) {
		return strategy.doOpreation(num1, num2);
	}

}
