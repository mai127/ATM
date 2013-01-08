
public class Card {
	private String cardNO;
	private String ownedBY;
	private String pin;
	
	public void setPin (String p){
		
		pin=p;
	}
	
	public String getPin(){
		
		return pin;
	}
	
	public boolean access (String p){
		if(pin==p)
			return true;
		else
			return false;
		
	}
}
