
public class Withdraw extends Transaction{
	private double amount;
	private Account account;
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	public void Withdrawl(){
		double ammount=0;
		if(account.getBalance()>=ammount)
			account.setBalance(account.getBalance()-ammount);
		
	}
}
