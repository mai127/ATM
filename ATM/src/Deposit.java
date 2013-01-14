
public class Deposit extends Transaction {
		
	private double amount;
	
	
	public double getAmount() {
		return amount;
	}

	public Deposit(double amount) {
		this.amount = amount;
	}
	public Deposit(double a,Account ac){
		account=ac;
		amount=a;
	}
	@Override
	public void accountHandler() {
		account.setBalance(account.getBalance()+amount);
	}
	public String transType() {
		// TODO Auto-generated method stub
		return amount +" Deposited";
	}
}
