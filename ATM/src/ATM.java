import java.sql.*;
import java.util.Scanner;
public class ATM {
	
	public static void main(String args[]) {
		char s='k';
		Scanner scanner = new Scanner(System.in);
		
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
		
		/*
		
		
		
		
		
											DEN DOULEYEI EXEI BUG!!
		
		
		
		
		
		*/
		Transaction tr,tr1,tr2;
		ATMInfo atmInf = new ATMInfo("Aristoteloys sqr. 165", "Ethniki Trapeza");
		
		while(true){
			System.out.println("ATM INFO\nTopothesia:"+atmInf.getLocation()+"\nTrapeza:"+atmInf.getManagedBy());
			System.out.println("Parakalw eisagete Karta");
			int c=scanner.nextInt();
			

				System.out.println("Dwse pin kartas");
				int p=scanner.nextInt();
				tr=new PinValidation(c,p,bank1.accountCard(c));
				atmInf.setTransaction(tr);
				atmInf.identifies();
				System.out.println("Kalws Hrthate "+bank1.accountCard(c).getOwner());
				System.out.println("\n\n\n");
				while(s!='e'){
					
					System.out.println("Parakalw epilexte tin sunallagi sas");
					System.out.println("Dwse A gia analhpsh\nDwse B gia katathesh\nDwse C gia erwthsh upoloipou\nDwse D gia metafora xrhmatwn se allo logariasmo\nDwse F gia allagi Pin\nDwse E gia eksodo");
					
					s=scanner.next().toLowerCase().charAt(0);
					if(s=='a'){
						System.out.println("Dwse poso analipsis");
						double a=scanner.nextDouble();
						tr1=new Withdraw(a,bank1.accountCard(c));
						atmInf.setTransaction(tr1);
						atmInf.identifies();
						tr1=null;
						//break;
					}
					
					else if(s=='b'){
						System.out.println("Valte Ta xrhmata stin upodoxh");
						double a=scanner.nextDouble();
						tr1=new Deposit(a,bank1.accountCard(c));
						atmInf.setTransaction(tr1);
						atmInf.identifies();
						tr1=null;
						//break;
					}
					else if(s=='c'){
						tr1=new Query(bank1.accountCard(c));
						atmInf.setTransaction(tr1);
						atmInf.identifies();
						tr1=null;
						//break;
					}
					
					else if (s=='e'){
						System.out.println("Euxaristoume pou xrhsimopoihsate tis trapezikes mas uphresies "+bank1.accountCard(c).getOwner());
						System.out.println("Parakalw paralavete tin karta sas");
						break;
					}
					else{
						System.out.println("Lathos epilogi prospathise ksana");

					}
					s=scanner.next().charAt(0);
			}
			atmInf.newAtmCustomer();
		}
	
	}
}