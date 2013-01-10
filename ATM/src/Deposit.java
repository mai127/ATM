
public class Deposit extends Transaction {
		
	private double amount;
	
	
	public double getAmount() {
		return amount;
	}

	public Deposit(double amount) {
		this.amount = amount;
	}
	@Override
	public void accountHandler() {
		account.setBalance(account.getBalance()+amount);
	}
	public char transType() {
		// TODO Auto-generated method stub
		return 'd';
	}
}
