import java.sql.*;

public class Bank {
	
	public static void main(String args[]) {
	
		Card crd = new Card(1234567890,"UOM",1234);
		Account accnt = new Account("Papadopoulos Giannis", 1234554321, 1020.09, crd);
		Customer custmr = new Customer("Papadopoulos Giannis", "Egnatia 127 str.", accnt);
		PinValidation pinvld=new PinValidation(12343,accnt);
		
		
		ATMInfo atmInf = new ATMInfo("Aristoteloys sqr. 165", "Beta", pinvld);
		//atmInf.setTransaction(q);
		Withdraw withDr = new Withdraw(29.22,accnt);
		atmInf.setTransaction(withDr);
		atmInf.identifies();
		Query q=new Query(accnt);
		atmInf.setTransaction(q);
		atmInf.identifies();
	 
				
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
		
	} // end of main 
} // end of Bank class
