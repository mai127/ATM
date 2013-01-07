
public class CurrentAccount extends Account {
	 
	  // attributes
	private double AccountNumber;
	private double balance;
	
	  // operations
	public double getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(double AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
		// σε περίπτωση που κρατήσουμε το type
	public void credit(int amount) {  
		balance += amount;
	}
	public void debit(int amount) {
		balance += amount;
	}
}
