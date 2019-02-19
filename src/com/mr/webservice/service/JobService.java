package com.mr.webservice.service;

import java.util.List;

import com.mr.webservice.dao.JobDAOImpl;

import hibernate.Job;

public class JobService {
	
	JobDAOImpl jobDAO = new JobDAOImpl();
	
	public Job addJob(Job job)
	{
		return this.jobDAO.addJob(job);
	}
	public Job updateJob(Job job)
	{
		return this.jobDAO.updateJob(job);
	}
	public void deleteJob(int id)
	{
		this.jobDAO.deleteJob(id);
	}
	
	public Job getJobById(int id)
	{
		return this.jobDAO.getJobById(id);
	}
	
	public List<Job> getJobs()
	{
		return this.jobDAO.getJobs();
	};

}
