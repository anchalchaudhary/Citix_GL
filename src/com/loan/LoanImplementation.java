package com.loan;

//import com.LoanPojo;

public abstract class LoanImplementation implements Loan {
	protected abstract boolean verification(String customerId);

}
