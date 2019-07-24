package com;

public class LoanPojo {
	private String loanType;
	private long loanAmount;
	private short tenure;
	private String customerType;
	private float monthlyEMIAmount;
	
	public String getLoanType(){
		return loanType;
	}
	public void setLoanType(String loanType){
		this.loanType = loanType;
	}
	public long getLoanAmount(){
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount){
		this.loanAmount = loanAmount;
	}
	public short getTenure(){
		return tenure;
	}
	public void setTenure(short tenure){
		this.tenure = tenure;
	}
	public String getCustomerType(){
		return customerType;
	}
	public void setCustomerType(String customerType){
		this.customerType = customerType;
	}
	public float setMonthlyEMIAmount(){
		return monthlyEMIAmount;
	}
	public void setMonthlyEMIAmount(long monthlyEMIAmount){
		this.monthlyEMIAmount = monthlyEMIAmount;
	}
}
