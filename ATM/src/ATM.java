import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class ATM {
	
	public static void main(String args[]) {
		char s='k';
		System.out.println("Please press e for exit");
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
		
		
		while(s!='e'){
			
			
			
		}
		
		
	
	}
}