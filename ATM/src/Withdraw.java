
public class Withdraw extends Transaction {
	
	private double amou;
	//private Account account;
	public double getAmount() {
		return amou;
	}

	public void setAmount(double amou) {
		
		this.amou = amou;
	}
	
	public Withdraw(double a,Account ac){
		account=ac;
		amou=a;
	}
	
	@Override
	public void accountHandler(){
		if(account.getBalance()>=amou)
			account.setBalance(account.getBalance()-amou);
		
	}
	public String transType() {
		// TODO Auto-generated method stub
		return amou+" Withdrawed";
	}
}
