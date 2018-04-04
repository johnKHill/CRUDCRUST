//package com.javaHut.dao;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.PostConstruct;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import com.javaHut.model.Pizza;
//
//
//public class PizzaDao {
//	
//	@Qualifier("dataSource")
//	
//	@Autowired
//	private DataSource datasource;
//	
//	private JdbcTemplate jdbcTemplate;
//	
//	
//	List<Pizza> pizzaList;
//	
//	@PostConstruct
//	public void initializeList() {
//		jdbcTemplate = new JdbcTemplate(datasource);
//		pizzaList = new ArrayList<Pizza>();
//		pizzaList.add(new Pizza("Supreme", 34));
//		pizzaList.add(new Pizza("Cheese", 34));
//	}
//	
//	public Pizza getPizzaByName(String name) {
//		Pizza tempPizza = null;
//		for (Pizza pizza: pizzaList) {
//			if (pizza.getPizzaName().equals(name)){
//				tempPizza = pizza;
//			}
//		}
//		return tempPizza;
//	}
//}
