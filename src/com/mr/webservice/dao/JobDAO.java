package com.mr.webservice.dao;

import hibernate.Job;
import hibernate.Person;

public interface JobDAO {
	Job addJob(Job job);
	Job updateJob(Job job);
	void deleteJob(int id);
	Job getJobById(int id);
	java.util.List<Job> getJobs();
}
