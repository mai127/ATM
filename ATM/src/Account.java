
public abstract class Account {

	private String owner;
	private int AccountNumber;
	private double balance;

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void debit() {
		
	}
	public void credit() {
		
	}
}
