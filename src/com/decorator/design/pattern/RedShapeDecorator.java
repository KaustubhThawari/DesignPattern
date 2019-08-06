package com.decorator.design.pattern;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setBorderColor("red");
	}

	private void setBorderColor(String string) {
		System.out.println("Set border color to red.");
	}

}
