package com.asthvinayak.model;

//POJO(plan old java object)
public class Student {

	private String enrollNo;
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String city;

	public Student(String enrollNo, String firstName, String lastName, String phoneNo, String city) {
		super();
		this.enrollNo = enrollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.city=city;
	}

	public String getEnrollNo() {
		return enrollNo;
	}

	public void setEnrollNo(String enrollNo) {
		this.enrollNo = enrollNo;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Student [enrollNo=" + enrollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo="
				+ phoneNo + "]";
	}
	
	
	
	

}
