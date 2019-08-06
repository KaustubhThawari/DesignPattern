package com.decorator.design.pattern;

public class DecoratorDesignPatternDemo {

	public static void main(String[] args) {
		ShapeDecorator shapeDecorator = new RedShapeDecorator(new Rectangle());
		shapeDecorator.draw();
	}

}
