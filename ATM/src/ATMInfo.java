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
		transaction.get(transaction.size()-1).accountHandler();
		
		
	}
	
	
	
}
