package com.chain.of.responsiblity;

public interface Chain {

	public void nextChain(Chain chain);
	
	public void calculate(Number number);
}
