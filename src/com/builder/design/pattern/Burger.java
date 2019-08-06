package com.builder.design.pattern;

public abstract class Burger implements Item {

	@Override
	public Packing getPacking() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

}
