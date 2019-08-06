package com.faced.design.pattern;

public class ShapeMaker {
	Shape rectangle;
	Shape circle;
	Shape square;
	public ShapeMaker() {
		rectangle =  new Rectangle();
		circle =  new Circle();
		square =  new Square();
	}
	
	public void drawCricle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
}
