package com.librarymanagement.model;

public class StudentTO {
	private String id;
	private String name; 
	private String mobile;
	private String city;
	private String state;
	private String email;
	private String dateofbirth;
	private String password;
	private String gender;
	private String department;
	
	public StudentTO(String name, String mobile, String city, String state, String email, String dateofbirth,
			String password, String gender, String department) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.city = city;
		this.state = state;
		this.email = email;
		this.dateofbirth = dateofbirth;
		this.password = password;
		this.gender = gender;
		this.department = department;
	}
	public StudentTO(String id, String name, String mobile, String city, String state, String email, String dateofbirth,
			String password, String gender, String department) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.city = city;
		this.state = state;
		this.email = email;
		this.dateofbirth = dateofbirth;
		this.password = password;
		this.gender = gender;
		this.department = department;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
