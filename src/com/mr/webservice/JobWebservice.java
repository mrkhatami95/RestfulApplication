package com.mr.webservice;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mr.webservice.service.JobService;

import hibernate.Job;
import hibernate.Person;

@Path("/job")
public class JobWebservice {
	
	JobService jobService = new JobService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Job> getJobs()
	{
		return this.jobService.getJobs();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Job getJobById(@PathParam("jobId") int jobId)
	{
		return this.jobService.getJobById(jobId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)  
	public Job addJob(Job job)  
	{
		return jobService.addJob(job);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)  
	public Job updateJob(Job job)  
	{
		return jobService.updateJob(job);
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteJob(@PathParam("id") int id)
	{
		this.jobService.deleteJob(id);
	}
}
