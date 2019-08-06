package com.chain.of.responsiblity;

public class SubNumber implements Chain {

	private Chain nextChain;
	
	@Override
	public void nextChain(Chain chain) {
		// TODO Auto-generated method stub
		nextChain = chain;
	}

	@Override
	public void calculate(Number number) {
		if("Sub".equals(number.calculationType)) {
			System.out.println("Sub : "+ number.getNumber1() +" - "+ number.getNumber2() +" = "
					+(number.getNumber1() - number.getNumber2()) );	
		} else {
			nextChain.calculate(number);
		}
		
	}

}
