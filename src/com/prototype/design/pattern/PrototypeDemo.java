package com.prototype.design.pattern;

public class PrototypeDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());	
	      System.out.println(ShapeCache.getShape("1"));
	      System.out.println(ShapeCache.getShape("1"));
	      System.out.println(ShapeCache.getShape("1"));
	      System.out.println("--------------------------------------");
	      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());
	}

}
