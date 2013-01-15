public class PinChange extends Transaction{
	
	private int newPin;
	
	public PinChange(int p,Account ac){
		account=ac;
		newPin=p;
		
	}
	@Override
	public void accountHandler() {
		account.pinChange(newPin);
	}

	
	public String transType() {
		// TODO Auto-generated method stub
		return "Pin succesfully changed";
	}
}