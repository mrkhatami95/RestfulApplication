package com.mr.webservice.dao;

import java.util.List;

import hibernate.Person;

/*
* Created by Mohammadreza
* October 2016
* */

public interface PersonDAO {

	Person addPerson(Person person);
	Person updatePerson(Person person);
	Person getPerson(int id);
	void deletePerson(int id);
	List<Person> getPersons();
}
