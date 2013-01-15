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



public class ATM_gui1 {

	private JFrame frame;
	private JTextField textField;
	Bank bank1=bank1=new Bank();
	Card crd = new Card(1234567890,12345);
	Account accnt = new Account(1234554321, 1020);
	Customer custmr = new Customer("Papadopoulos Giannis", "Egnatia 127 str.", accnt);
	Transaction tr,tr1,tr2;
	ATMInfo atmInf = new ATMInfo("Aristoteloys sqr. 165", "Ethniki Trapeza");
	
	int p,c;
	
	
	//Buttons and labels
	JButton btCard = new JButton(" ");
	JButton btconfPin = new JButton("Confirm Pin");
	JButton btBalance = new JButton("Balance");
	JButton btWithdrawal = new JButton("Withdrawal");
	
	JTextArea txtrAtmBank = new JTextArea();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_gui1 window = new ATM_gui1();
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
	public ATM_gui1() {
		accnt.setCard(crd);
		bank1.addCard(crd);
		bank1.addCustomer(custmr);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		boolean cardEntered=false;
		
		
		
		
		
		frame = new JFrame();
		frame.getContentPane().setForeground(SystemColor.desktop);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 565, 433);
	//	frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setForeground(Color.black);
		textField.setBackground(SystemColor.activeCaption);
		textField.setEditable(false);
		textField.setBounds(115, 44, 335, 171);
		frame.getContentPane().add(textField);
		textField.setColumns(4);
		textField.setBorder(javax.swing.BorderFactory.createLineBorder(Color.gray));
		
		
		
		ImageIcon bt1icon = new ImageIcon("images/1.png");
		JButton bt1 = new JButton(bt1icon);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"1");
			}
		});
		bt1.setBounds(23, 248, 51, 42);
		frame.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("2");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		bt2.setBounds(195, 248, 45, 23);
		frame.getContentPane().add(bt2);
		
		JButton bt3 = new JButton("3");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		bt3.setBounds(245, 248, 45, 23);
		frame.getContentPane().add(bt3);
		
		JButton bt4 = new JButton("4");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		bt4.setBounds(145, 282, 45, 23);
		frame.getContentPane().add(bt4);
		
		JButton bt5 = new JButton("5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		bt5.setBounds(195, 282, 45, 23);
		frame.getContentPane().add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		bt6.setBounds(245, 282, 45, 23);
		frame.getContentPane().add(bt6);
		
		JButton bt9 = new JButton("9");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		bt9.setBounds(245, 316, 45, 23);
		frame.getContentPane().add(bt9);
		
		JButton bt8 = new JButton("8");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		bt8.setBounds(195, 316, 45, 23);
		frame.getContentPane().add(bt8);
		
		JButton bt7 = new JButton("7");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		bt7.setBounds(145, 316, 45, 23);
		frame.getContentPane().add(bt7);
		
		JButton btx = new JButton(" ");
		btx.setEnabled(false);		
		btx.setBounds(245, 352, 45, 23);
		frame.getContentPane().add(btx);
		
		JButton bt0 = new JButton("0");
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		bt0.setBounds(195, 352, 45, 23);
		frame.getContentPane().add(bt0);
		
		JButton bty = new JButton(" ");
		bty.setEnabled(false);
		bty.setBounds(145, 352, 45, 23);
		frame.getContentPane().add(bty);
		
		JButton btCancel = new JButton("Cancel");
		btCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btCancel.setBounds(318, 248, 89, 23);
		frame.getContentPane().add(btCancel);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()) {
					int caretPos = textField.getCaretPosition()-1;
					textField.setText(textField.getText().substring(0, caretPos) + 
						textField.getText().substring(caretPos+1));
				}
			}
		});
		clear.setBounds(318, 282, 89, 23);
		frame.getContentPane().add(clear);
		
		JButton btEnter = new JButton("Enter");
		btEnter.setBounds(318, 316, 89, 23);
		frame.getContentPane().add(btEnter);
		
		//Handling buttons------------------------------------------------------------------------------------------------------------------
		
		
		btWithdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				tr1=new Withdraw(a,bank1.accountCard(c));
				atmInf.setTransaction(tr1);
				atmInf.identifies();
				tr1=null;
			}
		});
		btWithdrawal.setBounds(10, 48, 100, 23);
		frame.getContentPane().add(btWithdrawal);
		
		JButton btDeposit = new JButton("Deposit");
		btDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				tr1=new Deposit(a,bank1.accountCard(c));
				atmInf.setTransaction(tr1);
				atmInf.identifies();
				tr1=null;
			}
		});
		btDeposit.setBounds(10, 81, 100, 23);
		frame.getContentPane().add(btDeposit);
		
		
		btBalance.setBounds(10, 115, 100, 23);
		btBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tr1=new Query(bank1.accountCard(c));
				atmInf.setTransaction(tr1);
				atmInf.identifies();
				
				tr1=null;
			}
		});
		frame.getContentPane().add(btBalance);
		
		JButton btTransfer = new JButton("Transfer");
		btTransfer.setBounds(10, 149, 100, 23);
		frame.getContentPane().add(btTransfer);
		
		JButton btPinChange = new JButton("Pin Change");
		btPinChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btPinChange.setBounds(10, 169, 100, 23);
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
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.GRAY);
		separator.setBounds(34, 235, 483, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblCard = new JLabel("CARD");
		lblCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblCard.setForeground(Color.BLACK);
		lblCard.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCard.setBackground(Color.LIGHT_GRAY);
		lblCard.setBounds(455, 73, 88, 23);
		frame.getContentPane().add(lblCard);
		
		
		btCard.setBounds(455, 98, 88, 11);
		btCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					c=Integer.parseInt(textField.getText());
					btCard.setText("No"+c);
					textField.setText("");
					btCard.setEnabled(false);
					txtrAtmBank.setText("Dwse Pin");
					
			}
		});
		frame.getContentPane().add(btCard);
		
		
		
		
		txtrAtmBank.setForeground(Color.BLACK);
		txtrAtmBank.setEditable(false);
		txtrAtmBank.setBackground(Color.LIGHT_GRAY);
		txtrAtmBank.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtrAtmBank.setText("Parakalw eisagete tin karta sas");
		txtrAtmBank.setBounds(216, -1, 129, 34);
		frame.getContentPane().add(txtrAtmBank);
	}
}
