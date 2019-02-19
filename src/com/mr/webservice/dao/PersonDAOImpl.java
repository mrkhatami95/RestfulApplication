package com.mr.webservice.dao;

import java.util.List;

import org.hibernate.Transaction;

import hibernate.Address;
import hibernate.Job;
import hibernate.Person;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;

public class PersonDAOImpl implements PersonDAO {

	public Person addPerson(Person person) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();
		session.close();
		return person;
	}

	public Person updatePerson(Person person) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String hql = "update Person set person_name = :name where personId = :id";
        Query query = session.createQuery(hql);
        //Job job = new Job();
        //person.getJob().getJobId();
        query.setInteger("id", person.getPersonId());
        query.setString("name", person.getPersonName());
        //person.setAddress(address);
        /*Job job = new Job();
		job.setTitle("software");
		session.save(job);
		person.setJob(job);
		*/
        int rowCount = query.executeUpdate();
        System.out.println("Rows affected: " + rowCount);
        session.saveOrUpdate(person);
        tx.commit();
        session.close();
        return person;
	}

	public Person getPerson(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from Person where personId = :id");
		query.setInteger("id", id);
		Person person = (Person) query.list().get(0);
		return person;
	}

	public void deletePerson(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String hql = "delete from Person where personId = :id";
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		int rowCount = query.executeUpdate();
		System.out.println("current row count : " + rowCount);
		tx.commit();
		session.close();	
	}

	public List<Person> getPersons() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from Person"); 	
		List<Person> persons = (List<Person>) query.list();
		return persons;
	}

}
