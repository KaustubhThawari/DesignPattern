package com.chain.of.responsiblity;

public class DivNumber implements Chain {

	private Chain nextChain;
	
	@Override
	public void nextChain(Chain chain) {
		// TODO Auto-generated method stub
		nextChain = chain;
	}

	@Override
	public void calculate(Number number) {
		if("Div".equals(number.calculationType)) {
			System.out.println("Div : "+ number.getNumber1() +" / "+ number.getNumber2() +" = "
					+(number.getNumber1() / number.getNumber2()) );	
		} else {
			System.out.println("Not Supported operation...");
		}
		
	}

}
