import java.util.ArrayList;


public class Bank {
	private ArrayList <ATMInfo> atm=new ArrayList();
	private ArrayList <Customer> customer=new ArrayList();
	private ArrayList <Card> card=new ArrayList();
	
	public void addCard(Card c){
		card.add(c);
		
	}
	
	public void addCustomer(Customer c){
		customer.add(c);
		
	}
	
	public void addATM(ATMInfo a){
		atm.add(a);
	}
	
	public Account accountCard(int n){
		int i;
		for(i=0;i<customer.size();i++){
			if(customer.get(i).getAccount().getCard()==n){
				break;
			}
		}
		
		return customer.get(i).getAccount();
	}
	public Account accountAccountNo(int n){
		int i;
		for(i=0;i<customer.size();i++){
			if(customer.get(i).getAccount().getAccountNumber()==n){
				break;
			}
		}
		
		return customer.get(i).getAccount();
	}
} // end of Bank class
