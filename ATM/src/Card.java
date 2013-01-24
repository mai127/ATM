
public class Card {
	private int cardNo;
	private String OwnedBy;
	private int pin;
	private int accountNo;
	public void setPin (int p){
		
		pin=p;
	}
	
	public int getPin(){
		
		return pin;
	}
	public void setOwnedBy(String n){
		OwnedBy=n;
	}
	public void setaccountNo(int a){
		accountNo=a;
	}
	
	public int getaccountNo(){
		return accountNo;
	}
	
	public Card() {
		cardNo=0;
		OwnedBy = " ";
		pin = 0;	
	}
	public Card(int crdNo, int pn) {
		cardNo=crdNo;
		OwnedBy = " ";
		pin = pn;
		accountNo=0;
	}
	public boolean pinValidations(int num,int pins){
		
		if(pin==pins&&cardNo==num){
	
			return true;
		}
		else {
	
			return false;
			
		}
	}
	public boolean access (int p){
		if(pin==p)
			return true;
		else
			return false;
	}

	public int getCardNO() {
		return cardNo;
	}


}
