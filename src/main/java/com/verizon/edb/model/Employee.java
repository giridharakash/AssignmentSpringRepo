package com.verizon.edb.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;

	@NotEmpty(message = "Name cannot be empty")
	@Size(min = 5, max = 15, message = "Name must be 5 to 15 characters")
	private String employeeName;
	
	@NotEmpty(message="Mail ID cannot be empty")
	@Email(message="Invalid Email ID")
	private String emailId;

	@NotEmpty(message="Number cannot be empty")
	@Pattern(regexp="\\d{10}",message="mobile number can only be 10 digits")
	@Column(name="mno")
	private String mobileNumber;
	
	@DateTimeFormat(iso=ISO.DATE)
	@NotNull(message="DOB cannot be empty")
	@Column(name="dob")
	private LocalDate dateOfBirth;
	
	@NotEmpty(message="Gender cannot be empty")
	private String gender;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
