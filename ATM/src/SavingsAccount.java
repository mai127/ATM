
public class SavingsAccount extends Account {

	
	private double AccountNumber;
	private double balance;
	
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
		// �� ��������� ��� ���������� �� type
	public void credit(int amount) {  
		balance += amount;
	}
	public void debit(int amount) {
		balance += amount;
	}
}
