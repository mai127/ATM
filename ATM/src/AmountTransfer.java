
public class AmountTransfer extends Transaction{
	
	private int amount;
	private int accountNumber;
	private Account transAc;
	
	public AmountTransfer(int amou,Account originalAccount,Account TransferAccount){
		amount=amou;
		account=originalAccount;
		transAc=TransferAccount;
		
	}
	@Override
	public void accountHandler() {
		int temp=0;
		if(account.getBalance()>=amount){
			account.setBalance(account.getBalance()-amount);
			temp=amount;
		}
		transAc.setBalance(transAc.getBalance()+amount);
	}
	public char transType() {
		// TODO Auto-generated method stub
		return 't';
	}
}
