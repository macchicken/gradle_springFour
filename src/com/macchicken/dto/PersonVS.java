package com.macchicken.dto;


public class PersonVS extends AceObject implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8442444458465139741L;


	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private String phone;
	private String sport;
    private String gender;

    public PersonVS() {
		super();
		this.firstName=null;
		this.lastName=null;
	}

	public PersonVS(String id, String firstName, String lastName) {
		super.setId(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getResidency() {
		return residency;
	}
	public void setResidency(String residency) {
		this.residency = residency;
	}
	public boolean isOver21() {
		return over21;
	}
	public void setOver21(boolean over21) {
		this.over21 = over21;
	}

	private String residency;
    private boolean over21;
//    private String [] carModels;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public String toString(){
		return "First Name: "+firstName+"| Last Name: "+lastName+"| Email: "+email+ "| Phone number:"+phone+"| Age: "+age+" Favorite Sport: " + sport
				+"| Gender: " + gender + "| Residency: " + residency + "| Over 21: " + isOver21();
	}
}
