package com.asthvinayak.model;

//POJO(plan old java object)
public class Student {

	private String enrollNo;
	private String firstName;
	private String lastName;
	private String phoneNo;

	public Student(String enrollNo, String firstName, String lastName, String phoneNo) {
		super();
		this.enrollNo = enrollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}

	public String getEnrollNo() {
		return enrollNo;
	}

	public void setEnrollNo(String enrollNo) {
		this.enrollNo = enrollNo;
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
