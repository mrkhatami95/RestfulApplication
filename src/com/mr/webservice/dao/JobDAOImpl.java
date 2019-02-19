package com.mr.webservice.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.Job;
import hibernate.Person;
import util.HibernateUtil;

public class JobDAOImpl implements JobDAO {

	@Override
	public Job addJob(Job job) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		//job.getPersons().add(person);
		session.save(job);
		tx.commit();
		return job;
	}

	@Override
	public Job updateJob(Job job) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String hql = "update Job set title = :title where jobId = :id";
        Query query = session.createQuery(hql);
        query.setInteger("id",job.getJobId());
        query.setString("title",job.getTitle());
        int rowCount = query.executeUpdate();
        System.out.println("Rows affected: " + rowCount);
        session.saveOrUpdate(job);
        tx.commit(); 
        session.close();
        return job;
	}

	@Override
	public void deleteJob(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String hql = "delete from Job where jobId = :id";
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		int rowCount = query.executeUpdate();
		System.out.println("current row count : " + rowCount);
		tx.commit();
		session.close();
	}

	@Override
	public Job getJobById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		String hql = "from Job where jobId = :jobId";
		Query query = session.createQuery(hql);
		query.setInteger("jobId", id);
		Job job = (Job) query.list().get(0);
		tx.commit();
		session.close();
		return job;
	}

	@Override
	public List<Job> getJobs() {
		String hql = "from Job";
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		List<Job> jobs = (List<Job>) query.list();
		return jobs;
	}

}
