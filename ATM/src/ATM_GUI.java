import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import javax.swing.JEditorPane;



public class ATM_GUI {

	private JFrame frame;
	private JTextField textField;
	Bank bank1 = new Bank();
	Card crd = new Card(1234567890,12345);
	Account accnt = new Account(1234554321, 1020);
	Customer custmr = new Customer("Papadopoulos Giannis", "Egnatia 127 str.", accnt);
	Transaction tr,tr1,tr2;
	ATMInfo atmInf = new ATMInfo("Aristoteloys sqr. 165", "Ethniki Trapeza");
	
	//read stream
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    PrintStream old = System.out;
    
	
	int p,c,t;
	boolean entercard=false;
	boolean enterpin=false;
	boolean enterwith=false;
	boolean enterbal=false;
	boolean enterdep=false;
	boolean enterpich=false;
	boolean entertrans=false;
	boolean entertrans2=false;
	
	//Buttons and labels
	JButton btCard = new JButton(" ");
	JButton btExTrans = new JButton("");
	JButton btExit = new JButton("");
	JButton btBalance = new JButton("");
	JButton btWithdrawal = new JButton("");
	JButton btDeposit = new JButton("");
	JButton btPinChange = new JButton("");
	JButton btTransfer = new JButton("");
	JLabel lblCard = new JLabel("_");
	
	JButton bt1 = new JButton("");
	JButton bt2 = new JButton("");
	JButton bt3 = new JButton("");
	JButton bt4 = new JButton("");
	JButton bt5 = new JButton("");
	JButton bt6 = new JButton("");
	JButton bt7 = new JButton("");
	JButton bt8 = new JButton("");
	JButton bt9 = new JButton("");
	JButton bt0 = new JButton("");
	JTextArea atmScr = new JTextArea();
	
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
		frame.setResizable(false);
		frame.getContentPane().setForeground(SystemColor.desktop);
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.setBounds(100, 100, 805, 726);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new JLabel(new ImageIcon("images/atm-bg1.jpg")));
		frame.getContentPane().setLayout(null);
		frame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setForeground(Color.black);
		textField.setBackground(new Color(0, 153, 255));
		textField.setEditable(false);
		textField.setBounds(186, 335, 409, 34);
		textField.setColumns(4);
		textField.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black,2));
		frame.getContentPane().add(textField);

// --- keypad creation -----------------------------------------------------		
		
		  // creation and settings of button 1
		ImageIcon bt1icon = new ImageIcon("images/1.png");
		bt1.setIcon(bt1icon);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"1");
			}
		});
		bt1.setBorderPainted(false);
		bt1.setContentAreaFilled(false); 
		bt1.setFocusPainted(false); 
		bt1.setOpaque(false);
		bt1.setBounds(260, 490, 51, 42);
		
		frame.getContentPane().add(bt1);
		  
		  // creation and settings of button 2		
		ImageIcon bt2icon = new ImageIcon("images/2.png");
		bt2.setIcon(bt2icon);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		bt2.setBorderPainted(false); 
		bt2.setContentAreaFilled(false); 
		bt2.setFocusPainted(false); 
		bt2.setOpaque(false);
		bt2.setBounds(321, 490, 51, 42);
		frame.getContentPane().add(bt2);
		
		  // creation and settings of button 3
		ImageIcon bt3icon = new ImageIcon("images/3.png");
		bt3.setIcon(bt3icon);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		bt3.setBorderPainted(false); 
		bt3.setContentAreaFilled(false); 
		bt3.setFocusPainted(false); 
		bt3.setOpaque(false);
		bt3.setBounds(382, 490, 51, 42);
		frame.getContentPane().add(bt3);
		
		  // creation and settings of button 4
		ImageIcon bt4icon = new ImageIcon("images/4.png");
		bt4.setIcon(bt4icon);
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
		bt4.setBounds(260, 538, 51, 42);
		frame.getContentPane().add(bt4);
		
 		  // creation and settings of button 5
		ImageIcon bt5icon = new ImageIcon("images/5.png");
		bt5.setIcon(bt5icon);
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		bt5.setBorderPainted(false); 
		bt5.setContentAreaFilled(false); 
		bt5.setFocusPainted(false); 
		bt5.setOpaque(false);
		bt5.setBounds(321, 538, 51, 42);
		frame.getContentPane().add(bt5);
		
	      // creation and settings of button 6
		ImageIcon bt6icon = new ImageIcon("images/6.png");
		bt6.setIcon(bt6icon);
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		bt6.setOpaque(false);
		bt6.setFocusPainted(false);
		bt6.setContentAreaFilled(false);
		bt6.setBorderPainted(false);
		bt6.setBounds(382, 538, 51, 42);
		frame.getContentPane().add(bt6);
		
		  // creation and settings of button 7
		ImageIcon bt7icon = new ImageIcon("images/7.png");
		bt7.setIcon(bt7icon);
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		bt7.setOpaque(false);
		bt7.setFocusPainted(false);
		bt7.setContentAreaFilled(false);
		bt7.setBorderPainted(false);
		bt7.setBounds(260, 586, 51, 42);
		frame.getContentPane().add(bt7);
		
		  // creation and settings of button 8
		ImageIcon bt8icon = new ImageIcon("images/8.png");
		bt8.setIcon(bt8icon);
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		bt8.setOpaque(false);
		bt8.setFocusPainted(false);
		bt8.setContentAreaFilled(false);
		bt8.setBorderPainted(false);
		bt8.setBounds(321, 586, 51, 42);
		frame.getContentPane().add(bt8);

		  // creation and settings of button 9
		ImageIcon bt9icon = new ImageIcon("images/9.png");
		bt9.setIcon(bt9icon);
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		bt9.setOpaque(false);
		bt9.setFocusPainted(false);
		bt9.setContentAreaFilled(false);
		bt9.setBorderPainted(false);
		bt9.setBounds(382, 586, 51, 42);
		frame.getContentPane().add(bt9);
		
		  // creation and settings of button 0
		ImageIcon bt0icon = new ImageIcon("images/0.png");
		bt0.setIcon(bt0icon);
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		bt0.setOpaque(false);
		bt0.setFocusPainted(false);
		bt0.setContentAreaFilled(false);
		bt0.setBorderPainted(false);
		bt0.setBounds(321, 634, 51, 42);
		frame.getContentPane().add(bt0);
		
		  // creation and settings of button x
		ImageIcon btxicon = new ImageIcon("images/x-y.png");
		JButton btx = new JButton(btxicon);
		btx.setOpaque(false);
		btx.setFocusPainted(false);
		btx.setContentAreaFilled(false);
		btx.setBorderPainted(false);
		btx.setBounds(260, 634, 51, 42);
		frame.getContentPane().add(btx);
		
		  // creation and settings of button x
		JButton bty = new JButton(btxicon);
		bty.setOpaque(false);
		bty.setFocusPainted(false);
		bty.setContentAreaFilled(false);
		bty.setBorderPainted(false);
		bty.setBounds(382, 634, 51, 42);
		frame.getContentPane().add(bty);
		
		  // creation and settings of button cancel
		ImageIcon btcancelicon = new ImageIcon("images/cancel.png");
		JButton btcancel = new JButton(btcancelicon);
		btcancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btcancel.setBounds(459, 490, 75, 42);
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
		btclear.setBounds(459, 538, 75, 42);
		frame.getContentPane().add(btclear);
		 
		  // creation and settings of button enter
		ImageIcon btentericon = new ImageIcon("images/enter.png");
		JButton btEnter = new JButton(btentericon);
		btEnter.setOpaque(false);
		btEnter.setFocusPainted(false);
		btEnter.setContentAreaFilled(false);
		btEnter.setBorderPainted(false);
		btEnter.setBounds(459, 586, 75, 42);
		frame.getContentPane().add(btEnter);
		
		btEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(enterpin){
						p=Integer.parseInt(textField.getText());
						tr=new PinValidation(c,p,bank1.accountCard(c));
						atmInf.setTransaction(tr);
						atmInf.identifies();
						if(atmInf.isAuthenticated()){
							atmScr.setText("\nSelect transaction");
							enterpin=false;
							textField.setText("");
							enableButtons();
							disableKeyPad();
							btExit.setEnabled(true);
							btExTrans.setEnabled(true);
						}
						else{
							atmScr.setText("Wrong credentials\nPlease try Again");
							btCard.setEnabled(true);
							textField.setText("");
							atmInf.newAtmCustomer();
							c=0;
							p=0;
							t=0;
						}
				}
				else if(enterbal){
						tr1=new Query(bank1.accountCard(c));
						atmInf.setTransaction(tr1);
						//atmInf.identifies();
						
						tr1=null;
						enterbal=false;
						textField.setText("");
						String s=getsBalance();
						atmScr.setText("\nBalance:\t$"+s);
						enableButtons();
						disableKeyPad();
				}
				else if(enterdep){
						if(!textField.getText().isEmpty()){
							int a=Integer.parseInt(textField.getText());
							tr1=new Deposit(a,bank1.accountCard(c));
							atmInf.setTransaction(tr1);
							atmInf.identifies();
							tr1=null;
							textField.setText("");
							atmScr.setText("\nDeposit Transaction Completed");
							enterdep=false;
							enableButtons();
							disableKeyPad();
						}
						else
						{
							enterdep=true;
							atmScr.setText("\nPlease first enter Amount and press Enter");
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
							atmScr.setText("\nWithdrawal Transaction Completed");
							enterwith=false;
							enableButtons();
							disableKeyPad();
						}
						else
						{
						enterwith=true;
						atmScr.setText("\nPlease first enter Amount and press Enter");
						}
				}
				else if(entertrans){
					if(!textField.getText().isEmpty()){
						int t=Integer.parseInt(textField.getText());
						textField.setText("");
						atmScr.setText("\nEnter Transfer Amount");
										
						entertrans2=true;
						enterpich=false;
						enableButtons();
						disableKeyPad();
					}
					else
					{
						entertrans=true;
						entertrans2=false;
						atmScr.setText("\nPlease first enter Transfer Account Number and press Enter");
					}
				
						entertrans=false;
				}
				else if(entertrans2){
					if(!textField.getText().isEmpty()){
						int a=Integer.parseInt(textField.getText());
						tr1=new AmountTransfer(a,bank1.accountCard(c),bank1.accountAccountNo(t));
						atmInf.setTransaction(tr1);
						atmInf.identifies();
						tr1=null;
						textField.setText("");
						atmScr.setText("\nCompleted Transfer Amount");
						entertrans2=false;
						enableButtons();
						disableKeyPad();
					}
					else {
						entertrans2=true;
						atmScr.setText("\nPlease first enter Transfer Account Number and press Enter");
					}
					entertrans2=false;
				}
				else if(enterpich){
					if(!textField.getText().isEmpty()){
						int a=Integer.parseInt(textField.getText());
						tr1=new PinChange(a,bank1.accountCard(c));
						atmInf.setTransaction(tr1);
						atmInf.identifies();
						tr1=null;
						textField.setText("");
						atmScr.setText("\nPIN Successfully Changed");
						enterpich=false;
						enableButtons();
						disableKeyPad();
					}
					else {
						enterpich=true;
						atmScr.setText("\nEnter new PIN and press Enter");
					}
					
				}
				else{
					atmScr.setText("\nSelect Transaction");
					enableButtons();
				}
			}
		});
					
					
				
		
		
		  // creation and settings of button z	
		ImageIcon btzicon = new ImageIcon("images/z.png");
		JButton btz = new JButton(btzicon);
		btz.setOpaque(false);
		btz.setFocusPainted(false);
		btz.setContentAreaFilled(false);
		btz.setBorderPainted(false);
		btz.setBounds(459, 634, 75, 42);
		frame.getContentPane().add(btz);
		
// --- end of keypad creation ----------------------------------------------
//-------- button handlers------------------------------------------------------
		btWithdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				atmScr.setText("\nEnter Withdrawal Amount and press Enter");
				enterwith=true;
				disableButtons();
				enableKeyPad();
			}
		});
		btDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				atmScr.setText("\nEnter Deposit Amount and press Enter");
				enterdep=true;
				disableButtons();
				enableKeyPad();
			}
		});
		
		btBalance.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					enterbal=true;
					textField.setText("");
					atmScr.setText("\nBalance Inquiry?\nPress Enter to confirm");
					disableButtons();
					enableKeyPad();
				}
		});
		
		btPinChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				atmScr.setText("\nEnter new PIN and press Enter");
				enterpich=true;
				disableButtons();
				enableKeyPad();
			}
		});
		
		btExTrans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(enterwith||enterbal|| enterdep||enterpich||entertrans||entertrans2){
					enterwith=false;
					enterbal=false;
					enterdep=false;
					enterpich=false;
					entertrans=false;
					entertrans2=false;
					textField.setText("");
					atmScr.setText("\nTransaction Canceled\nSelect Transaction");
					enableButtons();
					enableKeyPad();
				}

			}
		});
		
		btCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(lblCard.getText().equals("_")&&!textField.getText().isEmpty()){
					c=Integer.parseInt(textField.getText());
					lblCard.setText("No"+c);
					textField.setText("");
					btCard.setEnabled(false);
					atmScr.setText("\nEnter PIN and press Enter");
					enterpin=true;
				}
				else{
					atmScr.setText("\nEnter account number and press Insert Card slot");
				}
	
			}
		});
		
		btTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				atmScr.setText("\nEnter Transfer Account and press Enter");
				
				entertrans=true;
			}
		});
		btExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!enterwith&&!enterbal&&!enterdep&&!enterpich&&!entertrans&&!entertrans2&&!lblCard.getText().equals("_")){
					btCard.setEnabled(true);
					textField.setText("");
					atmInf.newAtmCustomer();
					c=0;
					p=0;
					t=0;
					//atmScr.setText("Telos sunalagwn\nParakalw paralavete\ntin karta sas");
					atmScr.setText("\nTransactions Completed\nPlease press Insert Card slot and recieve your Card");
					lblCard.setText("_");
					disableButtons();
					btExTrans.setEnabled(false);
					btExit.setEnabled(false);
					enableKeyPad();
				}

				else
					atmScr.setText("\nPlease first complete your Transactions");
	
			}
		});
		
//-------------------------------- END of Button handlers---------------------------------------
		
		disableButtons();
		btExTrans.setEnabled(false);
		btExit.setEnabled(false);
		btWithdrawal.setIcon(btxicon);
		btWithdrawal.setOpaque(false);
		btWithdrawal.setFocusPainted(false);
		btWithdrawal.setContentAreaFilled(false);
		btWithdrawal.setBorderPainted(false);
		
		btWithdrawal.setBounds(105, 155, 83, 47);
		
		frame.getContentPane().add(btWithdrawal);
		
		btDeposit.setIcon(btxicon);
		btDeposit.setOpaque(false);
		btDeposit.setFocusPainted(false);
		btDeposit.setContentAreaFilled(false);
		btDeposit.setBorderPainted(false);
		
		btDeposit.setBounds(105, 210, 83, 47);	
		
		frame.getContentPane().add(btDeposit);
		
		btBalance.setIcon(btxicon);
		btBalance.setOpaque(false);
		btBalance.setFocusPainted(false);
		btBalance.setContentAreaFilled(false);
		btBalance.setBorderPainted(false);
		
		btBalance.setBounds(105, 265, 83, 47);
		
		frame.getContentPane().add(btBalance);
		
		btTransfer.setIcon(btxicon);
		btTransfer.setOpaque(false);
		btTransfer.setFocusPainted(false);
		btTransfer.setContentAreaFilled(false);
		btTransfer.setBorderPainted(false);
		
		btTransfer.setBounds(599, 155, 83, 47);
		frame.getContentPane().add(btTransfer);
	
		btPinChange.setIcon(btxicon);
		btPinChange.setOpaque(false);
		btPinChange.setFocusPainted(false);
		btPinChange.setContentAreaFilled(false);
		btPinChange.setBorderPainted(false);
		
		btPinChange.setBounds(599, 210, 83, 47);
		frame.getContentPane().add(btPinChange);
	
		btExit.setIcon(btxicon);
		btExit.setOpaque(false);
		btExit.setFocusPainted(false);
		btExit.setContentAreaFilled(false);
		btExit.setBorderPainted(false);
		btExit.setBounds(599, 266, 83, 47);
		frame.getContentPane().add(btExit);
		


		btExTrans.setIcon(btxicon);
		btExTrans.setOpaque(false);
		btExTrans.setFocusPainted(false);
		btExTrans.setContentAreaFilled(false);
		btExTrans.setBorderPainted(false);
		btExTrans.setBounds(105, 320, 83, 47);
		frame.getContentPane().add(btExTrans);
			
		
		btCard.setBounds(617, 403, 162, 6);

		frame.getContentPane().add(btCard);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		
		
		separator.setBackground(Color.BLACK);
		separator.setBounds(22, 464, 754, 6);
		frame.getContentPane().add(separator);
		
	
		lblCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblCard.setForeground(Color.BLACK);
		lblCard.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCard.setBackground(Color.LIGHT_GRAY);
		lblCard.setBounds(614, 378, 166, 23);
		frame.getContentPane().add(lblCard);
	
		
		atmScr.setForeground(Color.BLACK);
		atmScr.setEditable(false);
		atmScr.setBackground(new Color(51, 153, 255));
		atmScr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		atmScr.setBounds(186, 144, 409, 180);
		atmScr.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black,2));
		atmScr.setText("\nEnter account number and press Insert Card slot");
		atmScr.setLineWrap(true);
		atmScr.setWrapStyleWord(true);
		frame.getContentPane().add(atmScr);
		
		JLabel label = new JLabel("");
		ImageIcon lbInsCard = new ImageIcon("images/insert-card.png");
		label.setIcon(lbInsCard);
		label.setBounds(683, 418, 27, 35);
		frame.getContentPane().add(label);
		
		JLabel hl_label = new JLabel("");
		ImageIcon lbHeadline = new ImageIcon("images/ATM-Machine.jpg");
		hl_label.setIcon(lbHeadline);
		hl_label.setBounds(155, 21, 477, 86);
		hl_label.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black,2));
		frame.getContentPane().add(hl_label);
		
		JEditorPane dtrpnWithdrawal = new JEditorPane();
		dtrpnWithdrawal.setEditable(false);
		dtrpnWithdrawal.setOpaque(false);
		dtrpnWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 14));
		dtrpnWithdrawal.setText("Withdrawal");
		dtrpnWithdrawal.setBounds(22, 166, 91, 20);
		frame.getContentPane().add(dtrpnWithdrawal);
		
		JEditorPane dtrpnDeposit = new JEditorPane();
		dtrpnDeposit.setEditable(false);
		dtrpnDeposit.setText("Deposit");
		dtrpnDeposit.setFont(new Font("Tahoma", Font.BOLD, 14));
		dtrpnDeposit.setOpaque(false);
		dtrpnDeposit.setBounds(22, 222, 91, 20);
		frame.getContentPane().add(dtrpnDeposit);
		
		JEditorPane dtrpnBalance = new JEditorPane();
		dtrpnBalance.setEditable(false);
		dtrpnBalance.setText("Balance");
		dtrpnBalance.setFont(new Font("Tahoma", Font.BOLD, 14));
		dtrpnBalance.setOpaque(false);
		dtrpnBalance.setBounds(22, 278, 91, 20);
		frame.getContentPane().add(dtrpnBalance);
		
		JEditorPane dtrpnTransfer = new JEditorPane();
		dtrpnTransfer.setEditable(false);
		dtrpnTransfer.setText("Transfer\nAmount");
		dtrpnTransfer.setFont(new Font("Tahoma", Font.BOLD, 14));
		dtrpnTransfer.setOpaque(false);
		dtrpnTransfer.setBounds(680, 155, 91, 35);
		frame.getContentPane().add(dtrpnTransfer);
		
		JEditorPane dtrpnPinChange = new JEditorPane();
		dtrpnPinChange.setEditable(false);
		dtrpnPinChange.setText("Pin Change");
		dtrpnPinChange.setFont(new Font("Tahoma", Font.BOLD, 14));
		dtrpnPinChange.setOpaque(false);
		dtrpnPinChange.setBounds(680, 222, 91, 20);
		frame.getContentPane().add(dtrpnPinChange);
		
		JEditorPane dtrpnConfirmPin = new JEditorPane();
		dtrpnConfirmPin.setEditable(false);
		dtrpnConfirmPin.setText("Exit Card");
		dtrpnConfirmPin.setFont(new Font("Tahoma", Font.BOLD, 14));
		dtrpnConfirmPin.setOpaque(false);
		dtrpnConfirmPin.setBounds(680, 278, 91, 20);
		frame.getContentPane().add(dtrpnConfirmPin);
		
		JEditorPane dtrpnExitTransaction = new JEditorPane();
		dtrpnExitTransaction.setText("Exit\nTransaction");
		dtrpnExitTransaction.setOpaque(false);
		dtrpnExitTransaction.setFont(new Font("Tahoma", Font.BOLD, 14));
		dtrpnExitTransaction.setEditable(false);
		dtrpnExitTransaction.setBounds(22, 321, 91, 34);
		frame.getContentPane().add(dtrpnExitTransaction);
		
		JLabel lbl_keypad = new JLabel("");
		lbl_keypad.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon lbkeypd = new ImageIcon("images/keypad-frame.png");
		lbl_keypad.setIcon(lbkeypd);
		lbl_keypad.setBounds(246, 477, 299, 209);
		frame.getContentPane().add(lbl_keypad);
			
		
	}
	String getsBalance(){
		System.setOut(ps);
		atmInf.identifies();
		
		System.out.flush();
	    System.setOut(old);
	    String s=baos.toString();
	    baos.reset();
		return s;
		
	}
	
	void enableButtons(){
		btBalance.setEnabled(true);
		btWithdrawal.setEnabled(true);
		btDeposit.setEnabled(true);
		btPinChange.setEnabled(true);
		btTransfer.setEnabled(true);
		
	}
	void disableButtons(){
		btBalance.setEnabled(false);
		btWithdrawal.setEnabled(false);
		btDeposit.setEnabled(false);
		btPinChange.setEnabled(false);
		btTransfer.setEnabled(false);
	}
	void enableKeyPad(){
		bt1.setEnabled(true);
		bt2.setEnabled(true);
		bt3.setEnabled(true);
		bt4.setEnabled(true);
		bt5.setEnabled(true);
		bt6.setEnabled(true);
		bt7.setEnabled(true);
		bt8.setEnabled(true);
		bt9.setEnabled(true);
		bt0.setEnabled(true);
	}
	void disableKeyPad(){
		bt1.setEnabled(false);
		bt2.setEnabled(false);
		bt3.setEnabled(false);
		bt4.setEnabled(false);
		bt5.setEnabled(false);
		bt6.setEnabled(false);
		bt7.setEnabled(false);
		bt8.setEnabled(false);
		bt9.setEnabled(false);
		bt0.setEnabled(false);
		
	}
}