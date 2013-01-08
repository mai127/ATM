
public class ATMInfo {
	private String location;
	private String ManagedBy;
	private Transaction transaction;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public ATMInfo() {
		location = " ";
		ManagedBy = " ";
	}
	public ATMInfo(String locat, String MngBy, Transaction trans) {
		location = locat;
		ManagedBy = MngBy;
		transaction = trans;
	}
	
	public void identifies() {
		
	}
	
	
	
}
