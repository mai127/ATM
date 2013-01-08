
public class Card {
	private int cardNO;
	private String ownedBY;
	private int pin;
	
	public void setPin (int p){
		
		pin=p;
	}
	
	public int getPin(){
		
		return pin;
	}
	
	public Card() {
		cardNO = 0;
		ownedBY = " ";
		pin = 0;	
	}
	public Card(int crdNo, String ownBy, int pn) {
		cardNO = crdNo;
		ownedBY = ownBy;
		pin = pn;	
	}
	
	public boolean access (int p){
		if(pin==p)
			return true;
		else
			return false;
	}
}
