
public class Deposit extends Transaction {
		
	private double amount;
	
	
	public double getAmount() {
		return amount;
	}

	public Deposit(double amount) {
		this.amount = amount;
	}
		
	public void accountHandler() {
		account.setBalance(account.getBalance()+amount);
	}
}
