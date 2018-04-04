package com.javaHut.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.javaHut.Greeting;
import com.javaHut.dao.PersonDao;
import com.javaHut.model.Person;
import com.javaHut.model.Pizza;

@RestController
public class PizzasController {


	@Autowired
	PersonDao personDao;

	@RequestMapping("/person")
	public Person getPerson() {
		return personDao.getPersonById();
	}
	
	@RequestMapping("/addperson")
	public void createPersonById() {
		personDao.createPersonById();
	}
	
	@RequestMapping("/updateperson")
	public void updatePersonById() {
		personDao.updatePersonById();
	}
	
	@RequestMapping("/deleteperson")
	public void deletePersonById() {
		personDao.deletePersonById();
	}


}
