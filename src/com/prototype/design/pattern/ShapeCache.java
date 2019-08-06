package com.prototype.design.pattern;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String, Shape> cache = new Hashtable<String, Shape>();
	
	public static void loadCache() {
		cache.put("1", new Rectangle("1"));
		cache.put("2", new Square("2"));
	}
	
	public static Shape getShape(String shapeId) {
	      Shape cachedShape = cache.get(shapeId);
	      return (Shape) cachedShape.clone();
	}
}
