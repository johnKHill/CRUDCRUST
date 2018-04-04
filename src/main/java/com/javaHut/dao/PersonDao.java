package com.javaHut.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.javaHut.model.Person;

@Component
public class PersonDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//Create Person
	private final String SQL = "SELECT personid, lastname, firstname, address, city FROM public.hill where personid = 2";
	
	//Read Person
	private final String SQL2 = "insert into Hill values(7, 'Derek', 'Jeter', 'Style St', 'New York')";
	
	//Update new Person
	private final String SQL3 = "update public.Hill set address = 'WestSide Drive' where PersonID = 7";
	
	//Delete Person
	private final String SQL4 = "delete from public.Hill where personid=6";
	
	
	
	/*METHODS ARE LISTED BELOW*/
	
	//Creates a new person in the DB
	public void createPersonById() {

		int p= jdbcTemplate.update(SQL2);
	}
	
	
	//Reads/Gets person by their ID
	public Person getPersonById() {

		List<Person> p= jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Person.class));

		return p.get(0);
	}
	
	
	//Updates a person in the Hill DB
		public void updatePersonById() {

			int p= jdbcTemplate.update(SQL3);
		}
		
		
	//Delete a person from the Hill DB
		public void deletePersonById() {

			int p= jdbcTemplate.update(SQL4);
		}
	
	
}

