package com.factory.pattern;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		Shape shape = null;
		if("Circle".equalsIgnoreCase(shapeType)) {
			shape = new Circle();
		}else if("Rectangle".equalsIgnoreCase(shapeType)) {
			shape = new Rectangle();
		}if("Square".equalsIgnoreCase(shapeType)) {
			shape = new Square();
		}if("Triangle".equalsIgnoreCase(shapeType)) {
			shape = new Triangle();
		}
		return shape;
	}
}
