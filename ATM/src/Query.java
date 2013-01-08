
public class Query extends Transaction{
	private String aQuery;//Not sure for the type yet
	
	private Account account;
	
	
	public double queryResults(){
		account=new Account();
		return account.getBalance();
		
	}
}//class completely wrong must have class account first
