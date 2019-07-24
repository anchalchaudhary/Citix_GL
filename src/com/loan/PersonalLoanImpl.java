package com.loan;

import com.LoanPojo;

public class PersonalLoanImpl extends LoanImplementation {

	public long calculateTotalLoanAmountForPersonalLoan(LoanPojo loanPojo){
		
		long totalLoanAmount = 0;
		if(loanPojo.getLoanType().equals("PL")){
			if(loanPojo.getCustomerType().equals("employee")){
				
			} else if(loanPojo.getCustomerType().equals("business")){
				
			}
		}
		else{
			//others
		}
		return totalLoanAmount;
	}
	public boolean checkEligibility(){
		
		return false;
	}
	public boolean verification(){
		
		return false;
	}
	public long calculateTotalLoanAmount(LoanPojo loanPojo) {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean checkEligibility(LoanPojo loanPojo) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean verification(String customerId) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean acceptLoanRequest(String customerId) {
		// TODO Auto-generated method stub
		return false;
	}
	public void processLoan(String customerId) {
		// TODO Auto-generated method stub
		
	}
}
