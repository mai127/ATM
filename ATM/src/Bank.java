
public class Bank {
	
	public static void main(String args[]) {
		
		Card crd = new Card(1234567890,"UOM",1234);
		Account accnt = new Account("Papadopoulos Giannis", 1234554321, 1020.09, crd);
		Customer custmr = new Customer("Papadopoulos Giannis", "Egnatia 127 str.", accnt);
		Withdraw withDr = new Withdraw(29.22,accnt);
		ATMInfo atmInf = new ATMInfo("Aristoteloys sqr. 165", "Beta", withDr);
		
		
		System.out.println(accnt.getBalance());
	}
}
