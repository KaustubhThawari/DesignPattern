package com.builder.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<Item>();
	
	public float getCost() {
		float totalCost = 0f;
		for(Item item : items) {
			totalCost = totalCost + item.getCost();
		}
		
		return totalCost;
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void listItem() {
		for(Item item : items) {
			System.out.print("Item {Name : " + item.getName());
			System.out.print(", Packing : "+item.getPacking().pack());
			System.out.println(", Cost : "+item.getCost()+"}");
		}
	}
}
