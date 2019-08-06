package com.builder.design.pattern;

public abstract class ColdDrink implements Item {

	@Override
	public Packing getPacking() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

}
