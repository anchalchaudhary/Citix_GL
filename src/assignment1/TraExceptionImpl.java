package assignment1;

public class TraExceptionImpl {

	public static void main(String args[]) throws Exception{
		try{
			AccountManagementImpl accountManagementImpl = new AccountManagementImpl();
			accountManagementImpl.InterBankTransfer("a11", "a23", 5000);
		}catch(Exception e){
			System.out.println("Insufficient amount");
		}
	}
}
