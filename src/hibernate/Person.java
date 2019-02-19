package hibernate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Person implements java.io.Serializable{  
    
	private Integer personId;  
	 
	private String personName;
	
	private Address address;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Job job;
	
	public Person(){}
		
	public Person(String personName, Address address,Job job) {
	    this.personName = personName;
	    this.address = address;
	    this.job = job;
	}
	 
	public Integer getPersonId() {  
	    return personId;  
	} 
	 
	public void setPersonId(Integer personId) {  
		this.personId = personId;  
	}
	 
	public String getPersonName() {
		return personName;
	}
	 
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
	
}