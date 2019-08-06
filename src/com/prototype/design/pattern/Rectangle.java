package com.prototype.design.pattern;

public class Rectangle extends Shape {

	public Rectangle(String id) {
		setId(id);
		type = "Rectangle";
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
	
}
