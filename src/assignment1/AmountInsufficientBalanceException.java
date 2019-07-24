package assignment1;

public class AmountInsufficientBalanceException extends Exception {

	AmountInsufficientBalanceException(String s){
		super("Balance insufficient");
	}
}
