package com.mr.webservice.dao;

import java.util.List;

import hibernate.Person;

public interface PersonDAO {

	Person addPerson(Person person);
	Person updatePerson(Person person);
	Person getPerson(int id);
	void deletePerson(int id);
	List<Person> getPersons();
}
