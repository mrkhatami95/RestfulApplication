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

import com.mr.webservice.service.PersonService;

import hibernate.Person;

/*
* Created by Mohammadreza
* October 2016
* */

@Path("/person")
public class RestfulWebserviceExample {

	 /*	 
 	 @GET
     @Path("/list")
     public Response personList() {

		 String output = "Hello WQorld";
         return Response.status(200).entity(output).build();
     }*/
	    
	 PersonService personService = new PersonService();  
	 //PersonDAOImpl personDAO = new PersonDAOImpl();
	 
     @GET
     @Produces(MediaType.APPLICATION_JSON)
     public List<Person> getPersons()
	 {
       List<Person> listOfPersons = personService.getAllPersons();	 
	   return listOfPersons;
	 }
	   
     @GET  
     @Path("/{id}")  
     @Produces(MediaType.APPLICATION_JSON)  
	 public Person getPersonById(@PathParam("id") int id)
	 {

		 return personService.getPerson(id);
	 }  
	       
     @POST  
     @Produces(MediaType.APPLICATION_JSON)  
	 public Person addPerson(Person person)  
	 {
    	 return personService.addPerson(person);
	 }  
	   
     @PUT  
     @Produces(MediaType.APPLICATION_JSON)  
	 public Person updatePerson(Person person)  
	 {  
	     return personService.updatePerson(person);  
	 }
	   
     @DELETE  
     @Path("/{id}")  
     @Produces(MediaType.APPLICATION_JSON)  
	 public void deletePerson(@PathParam("id") int id)  
	 {  
    	 personService.deletePerson(id);
	 }    
}