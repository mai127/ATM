
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
	
	public void setCard(Card c){
		card=c;
		card.setaccountNo(AccountNumber);
	}
	
	public int getCard(){
		return card.getCardNO();
	}
	
	
	public Account() {
		owner = " ";
		AccountNumber = 0;
		balance = 0.0;
		card = new Card();
		
	}
	public Account(int AccNum, double bal) {
		owner = " ";
		AccountNumber = AccNum;
		balance = bal;
		card = new Card();
		card.setOwnedBy(owner);
		card.setaccountNo(AccountNumber);
	}
	
	public boolean pinValidation(int num,int pin){
		if(card.getPin()==pin&&card.getCardNO()==num)
			return true;
		else 
			return false; 
		
	}
	
	public void pinChange(int pin){
		card.setPin(pin);
		
	}
	
}
