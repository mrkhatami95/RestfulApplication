package com.mr.webservice.service;

import java.util.List;

import com.mr.webservice.dao.PersonDAOImpl;

import hibernate.Person;  

/*
* Created by Mohammadreza
* October 2016
* */

public class PersonService {  
	  
	 PersonDAOImpl personDAOImpl = new PersonDAOImpl();
	  
	 public List<Person> getAllPersons()
	 {  
		 return this.personDAOImpl.getPersons();
	 }  
	  
	 public Person getPerson(int id)  	
	 {  
		 return this.personDAOImpl.getPerson(id);
	 }  
	 
	 public Person addPerson(Person person)  
	 {  
		 return this.personDAOImpl.addPerson(person);
	 }  
	   
	 public Person updatePerson(Person person)  
	 {  
		 return this.personDAOImpl.updatePerson(person);
	 }  
	 
	 public void deletePerson(int id)  
	 {  
		 this.personDAOImpl.deletePerson(id);
	 }
	 
}
