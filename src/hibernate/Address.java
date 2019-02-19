package hibernate;

public class Address implements java.io.Serializable {

	Integer adrsId;
	
	//Integer personId;
	 
	String address;
	
	/*@JsonBackReference
	Person person; bi-directional*/

	public Address(Integer adrsId, String address) {
		this.adrsId = adrsId;
		this.address = address;
	}
	
	public Address(){}

	/*public Address(Integer personId, String address) {
		this.personId = personId;
		this.address = address;
	}*/

	public Integer getAdrsId() {
		return adrsId;
	}

	/*public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
*/
	public void setAdrsId(Integer adrsId) {
		this.adrsId= adrsId;
	}

	/*public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
*/
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
