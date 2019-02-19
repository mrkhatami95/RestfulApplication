package hibernate;

public class Job implements java.io.Serializable{
	
	Integer jobId;
	
	String title;
	
	/*@JsonBackReference
	Set<Person> persons = new HashSet<Person>(0);*/
	
	public Job(){}
	
	public Job(Integer jobId, String title) {
		this.jobId = jobId;
		this.title = title;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

/*	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}
	*/
}
