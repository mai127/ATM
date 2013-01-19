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
	public String getManagedBy() {
		return ManagedBy;
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
	public ATMInfo(String locat, String MngBy) {
		location = locat;
		ManagedBy = MngBy;
		transaction.add(null);
	}
	public void identifies() {
		if(isAuthenticated())
			transaction.get(transaction.size()-1).accountHandler();
		else
			System.out.println("User Not authenticated");
			
		
	}
	
	public void newAtmCustomer(){
		transaction.clear();
		transaction.add(null);
	}
	
	public boolean isAuthenticated(){
		transaction.get(1).accountHandler();
		
		if(transaction.get(1).transType().equals("Authenticated"))
			return true;
		else
			return false;
		
	}
}
