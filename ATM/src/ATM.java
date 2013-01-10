import java.sql.*;
import java.util.Scanner;
public class ATM {
	
	public static void main(String args[]) {
		char s='k';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please press e for exit");
		/*
		try {
			  // Load the JDBC driver 
			Class.forName("org.sqlite.JDBC");
			  // Establish the connection to the database ATM
			String db = "jdbc:sqlite:ATM.db";
			  // create database connection
			Connection con = DriverManager.getConnection(db);
			  // Creates some Statement objects for sending SQL statements to the database
			Statement st1 = con.createStatement();
			
			String sql = ("create table if not exists 'Customer' (Name String, Address String)");
			st1.executeUpdate(sql);
				
			st1.executeUpdate("insert into Customer values ('Gigi K.', 'Egnatia str. 12')");
			st1.executeUpdate("insert into Customer values ('Kiki G.', 'Tsimiski str. 13')");
			  // query execution
			String query = "select * from Customer";
			ResultSet rs = st1.executeQuery(query);
			 
			// prints query results
			while (rs.next()) {
				System.out.print(rs.getString(1)+"\t\t");
				System.out.println(rs.getString(2));
			}	
			
			rs.close();
			st1.close();
			con.close();
		} // end of try 
		catch(Exception e) {
			System.out.println(e);
		} // end of catch
		*/
		Bank bank1=new Bank();
		Card crd = new Card(1234567890,12345);
		Card crd1 = new Card(123456789,1234);
		Card crd2 = new Card(12345678,1234);
		
		
		Account accnt = new Account(1234554321, 1020);
		Customer custmr = new Customer("Papadopoulos Giannis", "Egnatia 127 str.", accnt);
		accnt.setCard(crd);
		bank1.addCard(crd);
		bank1.addCustomer(custmr);
		
		//PinValidation pinvld=new PinValidation(1234567890,12345,bank1.accountCard(1234567890));
		
		
		//ATMInfo atmInf = new ATMInfo("Aristoteloys sqr. 165", "Beta", pinvld);
		//atmInf.setTransaction(q);
		//Withdraw withDr = new Withdraw(29.22,bank1.accountCard(1234567890));
		//atmInf.setTransaction(withDr);
		//atmInf.identifies();
		//Query q=new Query(bank1.accountCard(1234567890));
		//atmInf.setTransaction(q);
		//atmInf.identifies();
		System.out.println(crd.getaccountNo()+" "+bank1.accountCard(1234567890).getBalance());
		
		
		Transaction tr,tr1,tr2;
		while(s!='e'){
			System.out.println("Dwse arithmo kartas");
			int c=scanner.nextInt();
			System.out.println("Dwse pin kartas");
			int p=scanner.nextInt();
			
			tr=new PinValidation(c,p,bank1.accountCard(c));
			ATMInfo atmInf = new ATMInfo("Aristoteloys sqr. 165", "Beta", tr);
			System.out.println("Dwse poso analipsis");
			double a=scanner.nextDouble();
			tr1=new Withdraw(a,bank1.accountCard(c));
			atmInf.setTransaction(tr1);
			atmInf.identifies();
			tr2=new Query(bank1.accountCard(c));
			atmInf.setTransaction(tr2);
			atmInf.identifies();
			tr=null;
			tr1=null;
			tr2=null;
			s=scanner.next().charAt(0);
		}
		
		
	
	}
}