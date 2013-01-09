
public class Account {

	private String owner;
	private int AccountNumber;
	private double balance;
	private Card card;
	
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
	
	public Account() {
		owner = " ";
		AccountNumber = 0;
		balance = 0.0;
		card = new Card();
		
	}
	public Account(String ownr, int AccNum, double bal, Card crd) {
		owner = ownr;
		AccountNumber = AccNum;
		balance = bal;
		card = crd;
	}
	
	
}
