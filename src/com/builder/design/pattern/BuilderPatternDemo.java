package com.builder.design.pattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mealBuilder = new MealBuilder();
		System.out.println("Non-Veg Meal");
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.listItem();
		System.out.println("Total Cost : "+nonVegMeal.getCost());
		System.out.println("------------------------------------------");
		System.out.println("Veg Meal");
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.listItem();
		System.out.println("Total Cost : "+vegMeal.getCost());
	}

}
