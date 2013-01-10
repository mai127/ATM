import java.util.ArrayList;


public class ATMInfo {
	private String location;
	private String ManagedBy;
	private ArrayList <Transaction> transaction=new ArrayList<Transaction>();

	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setTransaction(Transaction tr){
		transaction.add(tr);
	}
	
	public ATMInfo() {
		location = " ";
		ManagedBy = " ";
	}
	public ATMInfo(String locat, String MngBy, Transaction trans) {
		location = locat;
		ManagedBy = MngBy;
		transaction.add(trans);
	}

	public void identifies() {
		if(isAuthenticated()){
			transaction.get(transaction.size()-1).accountHandler();
			//System.out.println(transaction.get(transaction.size()-1).transType());
		}
		else{
			//System.out.println(transaction.get(0).transType());
			System.out.println("User Not authenticated");
			}
		
	}
	

	
	public boolean isAuthenticated(){
		transaction.get(0).accountHandler();
		System.out.println(transaction.get(0).transType());
		if(transaction.get(0).transType()=='V')
			return true;
		else
			return false;
		
	}
}
