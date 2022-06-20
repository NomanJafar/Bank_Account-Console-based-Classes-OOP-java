package Task_2;

public class Bank_Account {
	protected String AccountHolderName = null;
	protected long AccountBalance = 0;
	protected String AccountNumber = null;

	
	public Bank_Account(String Name, long Balance, String  Number) {
		this.AccountHolderName = Name;
		this.AccountBalance = Balance;
		this.AccountNumber = Number;
		
	}
	
	public Bank_Account() {
		
	}
	
	// Deposite
	
	protected void Deposite(long amount) {
		this.AccountBalance = this.AccountBalance + amount;
	
		System.out.println("The amount of "+ amount +" has been added to your account");
	}
	
	//Withdraw
	
	protected void Withdraw(long amount) {
		this.AccountBalance = this.AccountBalance - amount;
	
		System.out.println("The amount of "+ amount +" has been withdrawn from your account");
	}
	
	
	// Show Balance
	protected void showBalance() {
	
		System.out.println("Your current Balance  is "+ this.AccountBalance );
	}
	
	public String toString() {
		return " Account holder Name : "+ this.AccountHolderName +" \n Account Number : "+ this.AccountNumber
				+"\n Account Balance : " + this.AccountBalance;
	}
	
	
}


