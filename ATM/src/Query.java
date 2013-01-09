
public class Query extends Transaction{
	//private String aQuery;//Not sure for the type yet
	
	//private Account account;
	public Query(Account ac){
		account=ac;
	}
	
	public void accountHandler(){
		//account=new Account();
		System.out.println( account.getBalance());
		
	}
}//class completely wrong must have class account first
