package com.example.myapp.dto;

//import jakarta.persistence.Column;

public class EmployeeDto {
	private Long id;
	private String FirstName;
	private String LastName;
	private String Email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	
	public EmployeeDto(Long id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
	}
	public EmployeeDto() {
		super();
	}
	
}
