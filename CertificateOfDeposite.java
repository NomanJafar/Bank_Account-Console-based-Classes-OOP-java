package Task_2;

public class CertificateOfDeposite extends Bank_Account{
	private int MonthlyInterestRatePrsnt = 0;
	private int DepositeDurationMonths = 0;


	
	
	protected void Deposite(long amount) {
		this.AccountBalance = this.AccountBalance + amount;
	
		System.out.println("The amount of "+ amount +" has been added to your account as Certi");
	}

	
	// writting a different deposite method for C O D 
	public void Deposite(long amount, int monthlyInterestprnt, int Duration ) {
		
		this.AccountBalance = amount;
		this.DepositeDurationMonths = Duration;
		this.MonthlyInterestRatePrsnt = monthlyInterestprnt;
		
		this.Deposite(amount);
			
	}
	
	
	//Withdraw override 
	
	protected void Withdraw(long amount) {
		
		
		this.AccountBalance = this.AccountBalance - amount;
	
		System.out.println("The amount of "+ amount +" has been withdrawn from your account");
	}
	
	
	
	
	
}


