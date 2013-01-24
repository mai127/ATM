
public class AmountTransfer extends Transaction{
	
	private double amount;
	private int accountNumber;
	
	
	public AmountTransfer(double amou,Account originalAccount,Account TransferAccount){
		amount=amou;
		account=originalAccount;
		transAc=TransferAccount;
		
	}
	@Override
	public void accountHandler() {
		double temp=0;
		if(account.getBalance()>=amount){
			account.setBalance(account.getBalance()-amount);
			temp=amount;
		}
		transAc.setBalance(transAc.getBalance()+amount);
	}
	public String transType() {
		// TODO Auto-generated method stub
		
		return amount+" Transfered to"+transAc.getAccountNumber();
	}
}
