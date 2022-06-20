package Task_2;

public class CheckingAccount extends Bank_Account {
	
	private long limit =0;

	public CheckingAccount(String AccountHolderName, long Balance, String AccountNumber) {
		super(AccountHolderName, Balance , AccountNumber);
		
	}

	
	// overriding the withdraw method to check limit before initiating withdrawal
	protected void Withdraw(long amount) {
		if(amount<= this.limit) {
			this.AccountBalance = this.AccountBalance - amount;
			
			System.out.println("The amount of "+ amount +" has been withdrawn from your account");
		}
		
		else {
			System.out.println("Sorry! You have reached maximum withdrawn limit per day. \n Thank you for banking with us");
		}
	
	}
	
	
	
	

}
