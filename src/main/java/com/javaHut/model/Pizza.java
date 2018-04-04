package com.javaHut.model;

public class Pizza {
	
	private String pizzaName ;
	private double price;
	public Pizza() {}
	
	public Pizza(String pizzaName,double price) {
		this.pizzaName = pizzaName;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getPizzaName() {
		return pizzaName;
	}


}
