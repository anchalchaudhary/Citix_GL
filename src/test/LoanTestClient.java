package test;

import java.util.Scanner;

import com.loan.*;

public class LoanTestClient {

	Loan loan = null;
	private Loan getLoanObj(String loanType){
		
		if(loanType.equals("PL")){
			loan = new PersonalLoanImpl();
		} else if(loanType.equals("HL")){
			loan = new HomeLoanImpl();
		}
		return loan;
	}
	@SuppressWarnings("unused")
	public static void main(String args[]){
		
		LoanTestClient loanTestClient = new LoanTestClient();
		
		Loan pl = new PersonalLoanImpl();
		Loan gl = new GoldLoanImpl();
		Loan hl = new HomeLoanImpl();
		Loan vl = new VehicleLoanImpl();
		
		PersonalLoanImpl plo = new PersonalLoanImpl();
		GoldLoanImpl glo = new GoldLoanImpl();
		VehicleLoanImpl vlo = new VehicleLoanImpl();
		HomeLoanImpl hlo = new HomeLoanImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Loan Type: \n");
		String loanType = sc.next();
		
		Loan loan = (Loan) loanTestClient.getLoanObj(loanType);
		
		System.out.println("Please enter Customer Id: \n");
		String customerId = sc.next();
		
		sc.close();
		loan.processLoan(customerId);
		
		
	}
}
