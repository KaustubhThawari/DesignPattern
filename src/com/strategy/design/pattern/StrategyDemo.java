package com.strategy.design.pattern;

public class StrategyDemo {

	public static void main(String[] args) {
		Context context = new Context(new AddOperation());
		System.out.println("Addition Operation result : "+context.executeOperation(10, 20));
		context = new Context(new SubOperation());
		System.out.println("Substraction Operation result : "+context.executeOperation(10, 20));
		context = new Context(new MulOperation());
		System.out.println("Multiplication Operation result : "+context.executeOperation(10, 20));
		context = new Context(new DivOperation());
		System.out.println("Divide Operation result : "+context.executeOperation(10, 20));
	}

}
