package assignment1;

public class AccountManagementImpl {

	long currentBalance = 4000;
	void InterBankTransfer(String benfAccNo, String currentAccNo, long amount){//throws AmountInsufficientBalanceException{
		
		if(currentBalance>=amount){
			currentBalance = currentBalance - amount;
		} else {
			throw new NoMinimumBalanceException();
		}
	}
}
