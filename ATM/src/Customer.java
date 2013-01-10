
public class Customer {
	
	private String name;
	private String address;
	private Account account;
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Account getAccount(){
		return account;
	}
	
	
	public Customer() {
		name = " ";
		address = " ";
		account = new Account();
	} 
	public Customer(String nm, String addr, Account acc) {
		name = nm;
		address = addr;
		account = acc;
		account.setOwner(name);
	}
}
