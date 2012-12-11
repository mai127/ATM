
public abstract class Transaction {

	private int transactionId; //κωδικός συναλλαγής
	
	private int date;			//ημερομηνία συναλλ
	
	public int getDate() {
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
	
	
	
}
