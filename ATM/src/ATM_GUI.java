import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.Icon;


public class ATM_GUI {

	private JFrame frame;
	private JTextField textField;
	Bank bank1=bank1=new Bank();
	Card crd = new Card(1234567890,12345);
	Account accnt = new Account(1234554321, 1020);
	Customer custmr = new Customer("Papadopoulos Giannis", "Egnatia 127 str.", accnt);
	Transaction tr,tr1,tr2;
	ATMInfo atmInf = new ATMInfo("Aristoteloys sqr. 165", "Ethniki Trapeza");
	
	int p,c;
	boolean entercard=false;
	boolean enterpin=false;
	boolean enterwith=false;
	boolean enterbal=false;
	boolean enterdep=false;
	boolean entrpinch=false;
	boolean entertrans=false;
	
	//Buttons and labels
	ImageIcon btentericon = new ImageIcon("images/enter.png");
	JButton btEnter = new JButton(btentericon);
	
	
	JButton btCard = new JButton(" ");
	
	JButton btconfPin = new JButton("Confirm Pin");
	JButton btBalance = new JButton("Balance");
	JButton btWithdrawal = new JButton("Withdrawal");
	JButton btDeposit = new JButton("Deposit");
	JButton btPinChange = new JButton("Pin Change");
	JButton btTransfer = new JButton("Transfer");
	JLabel lblCard = new JLabel("CARD");
	
	JTextArea txtrAtmBank = new JTextArea();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_GUI window = new ATM_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM_GUI() {
		accnt.setCard(crd);
		bank1.addCard(crd);
		bank1.addCustomer(custmr);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.getContentPane().setForeground(SystemColor.desktop);
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.setBounds(100, 100, 643, 500);
	//	frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setForeground(Color.black);
		textField.setBackground(SystemColor.activeCaption);
		textField.setEditable(false);
		textField.setBounds(128, 193, 326, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(4);
		textField.setBorder(javax.swing.BorderFactory.createLineBorder(Color.gray));
		

// --- keypad creation -----------------------------------------------------		
		
		  // creation and settings of button 1
		ImageIcon bt1icon = new ImageIcon("images/1.png");
		JButton bt1 = new JButton(bt1icon);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"1");
			}
		});
		bt1.setBorderPainted(false); 
		bt1.setContentAreaFilled(false); 
		bt1.setFocusPainted(false); 
		bt1.setOpaque(false);
		bt1.setBounds(137, 256, 51, 42);
		frame.getContentPane().add(bt1);
		  
		  // creation and settings of button 2		
		ImageIcon bt2icon = new ImageIcon("images/2.png");
		JButton bt2 = new JButton(bt2icon);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		bt2.setBorderPainted(false); 
		bt2.setContentAreaFilled(false); 
		bt2.setFocusPainted(false); 
		bt2.setOpaque(false);
		bt2.setBounds(198, 256, 51, 42);
		frame.getContentPane().add(bt2);
		
		  // creation and settings of button 3
		ImageIcon bt3icon = new ImageIcon("images/3.png");
		JButton bt3 = new JButton(bt3icon);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		bt3.setBorderPainted(false); 
		bt3.setContentAreaFilled(false); 
		bt3.setFocusPainted(false); 
		bt3.setOpaque(false);
		bt3.setBounds(259, 256, 51, 42);
		frame.getContentPane().add(bt3);
		
		  // creation and settings of button 4
		ImageIcon bt4icon = new ImageIcon("images/4.png");
		JButton bt4 = new JButton(bt4icon);
		bt4.setBackground(Color.WHITE);
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		bt4.setBorderPainted(false); 
		bt4.setContentAreaFilled(false); 
		bt4.setFocusPainted(false); 
		bt4.setOpaque(false);
		bt4.setBounds(137, 304, 51, 42);
		frame.getContentPane().add(bt4);
		
 		  // creation and settings of button 5
		ImageIcon bt5icon = new ImageIcon("images/5.png");
		JButton bt5 = new JButton(bt5icon);
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		bt5.setBorderPainted(false); 
		bt5.setContentAreaFilled(false); 
		bt5.setFocusPainted(false); 
		bt5.setOpaque(false);
		bt5.setBounds(198, 304, 51, 42);
		frame.getContentPane().add(bt5);
		
	      // creation and settings of button 6
		ImageIcon bt6icon = new ImageIcon("images/6.png");
		JButton bt6 = new JButton(bt6icon);
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		bt6.setOpaque(false);
		bt6.setFocusPainted(false);
		bt6.setContentAreaFilled(false);
		bt6.setBorderPainted(false);
		bt6.setBounds(259, 304, 51, 42);
		frame.getContentPane().add(bt6);
		
		  // creation and settings of button 7
		ImageIcon bt7icon = new ImageIcon("images/7.png");
		JButton bt7 = new JButton(bt7icon);
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		bt7.setOpaque(false);
		bt7.setFocusPainted(false);
		bt7.setContentAreaFilled(false);
		bt7.setBorderPainted(false);
		bt7.setBounds(137, 352, 51, 42);
		frame.getContentPane().add(bt7);
		
		  // creation and settings of button 8
		ImageIcon bt8icon = new ImageIcon("images/8.png");
		JButton bt8 = new JButton(bt8icon);
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		bt8.setOpaque(false);
		bt8.setFocusPainted(false);
		bt8.setContentAreaFilled(false);
		bt8.setBorderPainted(false);
		bt8.setBounds(198, 352, 51, 42);
		frame.getContentPane().add(bt8);

		  // creation and settings of button 9
		ImageIcon bt9icon = new ImageIcon("images/9.png");
		JButton bt9 = new JButton(bt9icon);
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		bt9.setOpaque(false);
		bt9.setFocusPainted(false);
		bt9.setContentAreaFilled(false);
		bt9.setBorderPainted(false);
		bt9.setBounds(259, 352, 51, 42);
		frame.getContentPane().add(bt9);
		
		  // creation and settings of button 0
		ImageIcon bt0icon = new ImageIcon("images/0.png");
		JButton bt0 = new JButton(bt0icon);
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		bt0.setOpaque(false);
		bt0.setFocusPainted(false);
		bt0.setContentAreaFilled(false);
		bt0.setBorderPainted(false);
		bt0.setBounds(198, 400, 51, 42);
		frame.getContentPane().add(bt0);
		
		  // creation and settings of button x
		ImageIcon btxicon = new ImageIcon("images/x-y.png");
		JButton btx = new JButton(btxicon);
		btx.setOpaque(false);
		btx.setFocusPainted(false);
		btx.setContentAreaFilled(false);
		btx.setBorderPainted(false);
		btx.setBounds(137, 400, 51, 42);
		frame.getContentPane().add(btx);
		
		  // creation and settings of button x
		ImageIcon btyicon = new ImageIcon("images/x-y.png");
		JButton bty = new JButton(btyicon);
		bty.setOpaque(false);
		bty.setFocusPainted(false);
		bty.setContentAreaFilled(false);
		bty.setBorderPainted(false);
		bty.setBounds(259, 400, 51, 42);
		frame.getContentPane().add(bty);
		
		  // creation and settings of button cancel
		ImageIcon btcancelicon = new ImageIcon("images/cancel.png");
		JButton btcancel = new JButton(btcancelicon);
		btcancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btcancel.setBounds(336, 256, 75, 42);
		btcancel.setOpaque(false);
		btcancel.setFocusPainted(false);
		btcancel.setContentAreaFilled(false);
		btcancel.setBorderPainted(false);
		frame.getContentPane().add(btcancel);
		
		  // creation and settings of button clear
		ImageIcon btclearicon = new ImageIcon("images/clear.png");
		JButton btclear = new JButton(btclearicon);
		btclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
					int caretPos = textField.getCaretPosition()-1;
					textField.setText(textField.getText().substring(0, caretPos) + 
						textField.getText().substring(caretPos+1));
				}
			}
		});
		btclear.setOpaque(false);
		btclear.setFocusPainted(false);
		btclear.setContentAreaFilled(false);
		btclear.setBorderPainted(false);
		btclear.setBounds(336, 304, 75, 42);
		frame.getContentPane().add(btclear);
		 
		  // creation and settings of button enter
		
		btEnter.setOpaque(false);
		btEnter.setFocusPainted(false);
		btEnter.setContentAreaFilled(false);
		btEnter.setBorderPainted(false);
		btEnter.setBounds(336, 352, 75, 42);
		btEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			if(enterpin){
				p=Integer.parseInt(textField.getText());
				tr=new PinValidation(c,p,bank1.accountCard(c));
					atmInf.setTransaction(tr);
					atmInf.identifies();
					if(atmInf.isAuthenticated()){
						txtrAtmBank.setText("Parakalw epilexte/ntin sunalagi/nsas");
						enterpin=false;
						textField.setText("");
					}
					else{
						txtrAtmBank.setText("Wrong credentials\n Please try Again");
						btCard.setEnabled(true);
						textField.setText("");
						atmInf.newAtmCustomer();
						}
					}
			else if(enterbal){
				tr1=new Query(bank1.accountCard(c));
				atmInf.setTransaction(tr1);
				atmInf.identifies();
				tr1=null;
				enterbal=false;
				textField.setText("");
				}
			else if(enterdep){
				if(!textField.getText().isEmpty()){
					int a=Integer.parseInt(textField.getText());
					tr1=new Deposit(a,bank1.accountCard(c));
					atmInf.setTransaction(tr1);
					atmInf.identifies();
					tr1=null;
					textField.setText("");
					txtrAtmBank.setText("Euxaristoume gia\n tin sunalagi");
					enterdep=false;
					}
				else
					{
					enterdep=true;
					txtrAtmBank.setText("parakalw \neisagete poso\nkai patiste\nenter");
					}
				}
			else if(enterwith){
				if(!textField.getText().isEmpty()){
					int a=Integer.parseInt(textField.getText());
					tr1=new Withdraw(a,bank1.accountCard(c));
					atmInf.setTransaction(tr1);
					atmInf.identifies();
					tr1=null;
					textField.setText("");
					txtrAtmBank.setText("Euxaristoume gia\n tin sunalagi");
					enterwith=false;
					}
				else
					{
					enterwith=true;
					txtrAtmBank.setText("parakalw \neisagete poso\nkai patiste\nenter");
					}
				}
			else if(entertrans){
				
				
				}
			}
		});
		frame.getContentPane().add(btEnter);
		
		  // creation and settings of button z	
		ImageIcon btzicon = new ImageIcon("images/z.png");
		JButton btz = new JButton(btzicon);
		btz.setOpaque(false);
		btz.setFocusPainted(false);
		btz.setContentAreaFilled(false);
		btz.setBorderPainted(false);
		btz.setBounds(336, 400, 75, 42);
		frame.getContentPane().add(btz);
		
// --- end of keypad creation ----------------------------------------------
		
		
		
		
		btWithdrawal.setBounds(10, 24, 100, 23);
		btWithdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtrAtmBank.setText("Parakalw eisagete\nposo analipsis\nkai patiste\nenter");
				
				enterwith=true;
				}
			});
		frame.getContentPane().add(btWithdrawal);
		
		
		btDeposit.setBounds(10, 57, 100, 23);
		btDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtrAtmBank.setText("Parakalw eisagete\nposo katathesis\nkai patiste\nenter");
				
				enterdep=true;
				
				
			}
		});
		frame.getContentPane().add(btDeposit);
		
		
		btBalance.setBounds(10, 91, 100, 23);
		btBalance.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				enterbal=true;
				textField.setText("");
				txtrAtmBank.setText("Erwtisi upoloipou?\nEpilexte enter \ngia epivevaiwsh");
				
				}
			});
		frame.getContentPane().add(btBalance);
		
		
		btTransfer.setBounds(10, 125, 100, 23);
		
		frame.getContentPane().add(btTransfer);
		
		btPinChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btPinChange.setBounds(10, 159, 100, 23);
		frame.getContentPane().add(btPinChange);
		
		btconfPin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			p=Integer.parseInt(textField.getText());
			tr=new PinValidation(c,p,bank1.accountCard(c));
				atmInf.setTransaction(tr);
				atmInf.identifies();
				if(atmInf.isAuthenticated()){
					txtrAtmBank.setText("We are In");
				}
				else
					txtrAtmBank.setText("Not In");
				}
			});
			btconfPin.setBounds(10, 193, 100, 23);
			frame.getContentPane().add(btconfPin);
			
		
		btCard.setBounds(455, 98, 166, 6);
		btCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				c=Integer.parseInt(textField.getText());
				lblCard.setText("No"+c);
				textField.setText("");
				btCard.setEnabled(false);
				txtrAtmBank.setText("Dwse Pin kai patise enter");
				enterpin=true;
	
				}
			});
		frame.getContentPane().add(btCard);
		
		JSeparator separator = new JSeparator();
		
		
		separator.setBackground(Color.GRAY);
		separator.setBounds(34, 235, 483, 2);
		frame.getContentPane().add(separator);
		
		
		
		
		
		
		lblCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblCard.setForeground(Color.BLACK);
		lblCard.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCard.setBackground(Color.LIGHT_GRAY);
		lblCard.setBounds(455, 73, 166, 23);
		frame.getContentPane().add(lblCard);
		
		
		
		
		
		
		txtrAtmBank.setForeground(Color.BLACK);
		txtrAtmBank.setEditable(false);
		txtrAtmBank.setBackground(SystemColor.activeCaption);
		txtrAtmBank.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtrAtmBank.setText("Dwse arithmo kartas kai \npatise to \nkoumpi tis kartas");
		txtrAtmBank.setBounds(128, 24, 326, 158);
		frame.getContentPane().add(txtrAtmBank);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}