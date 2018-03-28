package com.javaHut.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.javaHut.service.PizzaCompService;

@RestController
public class Pizzas {
	PizzaCompService pizzaService = new PizzaCompService();
	
	
	public Pizzas(PizzaCompService pizzaService) {
		this.pizzaService = pizzaService;
		
	}
	
	@RequestMapping("/menu")
	public String Menu() {
		
		
		return pizzaService.getMenu();
		
	
	}
	
	

}
