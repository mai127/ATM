
public abstract class Transaction {

	protected int transactionId; 
	protected int date;			
	protected Account account;
	
	
	
	public int getDate() {	//setters and getters
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	abstract void accountHandler();
	
	
	
	
}
