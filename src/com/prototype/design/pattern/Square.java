package com.prototype.design.pattern;

public class Square extends Shape {

	public Square(String id) {
		setId(id);
		type = "Square";
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
	
}
