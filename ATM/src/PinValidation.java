
public class PinValidation extends Transaction{
	
	private int cardno;
	private int pin;
	private boolean flag=false;
	
	public PinValidation(int cardn,int p,Account ac){
		account=ac;
		pin=p;
		cardno=cardn;
	}
	@Override
	public void accountHandler() {
		flag=account.pinValidation(cardno,pin);
	}

	
	public char transType() {
		// TODO Auto-generated method stub
		if (flag == true)
			return 'V';
		else
			return 'q';
				
	}
}
