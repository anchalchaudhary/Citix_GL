package com;

public class CustomerPojo {
	private String customerId;
	private String firstName;
	private String lastName;
	private String gender;
	private String mobNo;
	
	public String getCustomerId(){
		return customerId;
	}
	public void setCustomerId(String customerId){
		this.customerId = customerId;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getMobNo(){
		return mobNo;
	}
	public void setMobNo(String mobNo){
		this.mobNo = mobNo;
	}
}
