
public class Withdraw extends Transaction {
	
	private double amount;
	private Account account;
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		
		this.amount = amount;
	}
	
	
	public Withdraw(double ammou, Account account) {
		
		if(account.getBalance()>=ammou)
			account.setBalance(account.getBalance()-ammou);
		
	}
}
