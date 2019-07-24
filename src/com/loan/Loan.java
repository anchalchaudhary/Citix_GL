package com.loan;

import com.LoanPojo;

public interface Loan {
	
	String companyName = "SCB";
	long calculateTotalLoanAmount(LoanPojo loanPojo);
	boolean checkEligibility(LoanPojo loanPojo);
	boolean acceptLoanRequest(String customerId);
	void processLoan(String customerId);
}
