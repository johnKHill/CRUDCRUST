package com.javaHut.service;

import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

import com.javaHut.dao.PizzaDao;
//import com.javaHut.Dao.PizzaDao;
import com.javaHut.model.Pizza;


@Component
public class PizzaCompService {

	PizzaDao pizza;
	Map<String, Double> pizzaMenu;

	
	
	public PizzaCompService() {
		pizzaMenu = new HashMap<String,Double>();
		this.pizza = new PizzaDao();
	}
      
	public String getMenu() {
		pizzaMenu = (HashMap<String, Double>) pizza.getMenu();
		String pizzamenu = "";
		for(Map.Entry<String, Double> entry: pizzaMenu.entrySet()) {
			pizzamenu+= entry.getKey() + " : "+ entry.getValue() + "\n";
		}
		return pizzamenu;
	}
}
