
public class PinValidation extends Transaction{
	private int oldPin;
	private int newPin;
	private int pin;
	private boolean flag=false;
	
	public PinValidation(int p,Account ac){
		account=ac;
		pin=p;
	}
	@Override
	public void accountHandler() {
		flag=account.pinValidation(pin);
	}

	
	public char transType() {
		// TODO Auto-generated method stub
		if (flag == true)
			return 'V';
		else
			return 'q';
				
	}
}
