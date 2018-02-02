package com.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	@NotNull(message="is requird")
	@Size(min=1,message="is required")
	private String lastName;
	
	@Min(value=0, message="must be greater than 0")
	@Max(value=10, message="must be less than 10")
	@NotNull(message="is required")
	private Integer freePass;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="has to be 5 digits/chars")
	private String postCode;
	
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
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
}
