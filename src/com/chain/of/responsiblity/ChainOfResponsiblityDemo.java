package com.chain.of.responsiblity;

public class ChainOfResponsiblityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain addNumber = new AddNumber();
		Chain subNumber = new SubNumber();
		Chain mulNumber = new MulNumber();
		Chain divNumber = new DivNumber();
		
		addNumber.nextChain(mulNumber);
		subNumber.nextChain(subNumber);
		mulNumber.nextChain(divNumber);
		
		Number number = new Number(2, 1, "Pow");
		addNumber.calculate(number);
		
		
	}

}
