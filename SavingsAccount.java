package Task_2;

public class SavingsAccount extends Bank_Account {
	
	protected int Annual_Interest = 0;
	
	public SavingsAccount(String AccountHolderName,long balance , String AccountNumber) {
		super(AccountHolderName, balance, AccountNumber);
	}

	
	
	
	// overridding the deposite method so that whenever the interest profit is achieved, the deposite is incremented
	protected void Deposite(long interest ) {
		this.AccountBalance += interest;
		System.out.println("The interest  of  amount  \""+ interest +"\" has been added to your account");
	}
	
	
	
}
