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


public class ATM_gui1 {

	private JFrame frame;
	private JTextField textField;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 563, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(109, 26, 335, 134);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bt1 = new JButton("1");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"1");
			}
		});
		bt1.setBounds(133, 183, 45, 23);
		frame.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("2");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		bt2.setBounds(183, 183, 45, 23);
		frame.getContentPane().add(bt2);
		
		JButton bt3 = new JButton("3");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		bt3.setBounds(233, 183, 45, 23);
		frame.getContentPane().add(bt3);
		
		JButton bt4 = new JButton("4");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		bt4.setBounds(133, 217, 45, 23);
		frame.getContentPane().add(bt4);
		
		JButton bt5 = new JButton("5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		bt5.setBounds(183, 217, 45, 23);
		frame.getContentPane().add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		bt6.setBounds(233, 217, 45, 23);
		frame.getContentPane().add(bt6);
		
		JButton bt9 = new JButton("9");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		bt9.setBounds(233, 251, 45, 23);
		frame.getContentPane().add(bt9);
		
		JButton bt8 = new JButton("8");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		bt8.setBounds(183, 251, 45, 23);
		frame.getContentPane().add(bt8);
		
		JButton bt7 = new JButton("7");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		bt7.setBounds(133, 251, 45, 23);
		frame.getContentPane().add(bt7);
		
		JButton btx = new JButton(" ");
		btx.setBounds(233, 287, 45, 23);
		frame.getContentPane().add(btx);
		
		JButton bt0 = new JButton("0");
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		bt0.setBounds(183, 287, 45, 23);
		frame.getContentPane().add(bt0);
		
		JButton bty = new JButton(" ");
		bty.setBounds(133, 287, 45, 23);
		frame.getContentPane().add(bty);
		
		JButton btCancel = new JButton("Cancel");
		btCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btCancel.setBounds(306, 183, 89, 23);
		frame.getContentPane().add(btCancel);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int carerPos = textField.getCaretPosition()-1;
				textField.setText(textField.getText().substring(0, carerPos) + 
						textField.getText().substring(carerPos+1));
			}
		});
		clear.setBounds(306, 217, 89, 23);
		frame.getContentPane().add(clear);
		
		JButton btEnter = new JButton("Enter");
		btEnter.setBounds(306, 251, 89, 23);
		frame.getContentPane().add(btEnter);
		
		JButton btWithdrawal = new JButton("Withdrawal");
		btWithdrawal.setBounds(5, 26, 100, 23);
		frame.getContentPane().add(btWithdrawal);
		
		JButton btDeposit = new JButton("Deposit");
		btDeposit.setBounds(5, 59, 100, 23);
		frame.getContentPane().add(btDeposit);
		
		JButton btBalance = new JButton("Balance");
		btBalance.setBounds(5, 93, 100, 23);
		frame.getContentPane().add(btBalance);
		
		JButton btTransfer = new JButton("Transfer");
		btTransfer.setBounds(5, 127, 100, 23);
		frame.getContentPane().add(btTransfer);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 171, 483, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblCard = new JLabel("CARD");
		lblCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblCard.setForeground(Color.BLACK);
		lblCard.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCard.setBackground(Color.LIGHT_GRAY);
		lblCard.setBounds(449, 55, 88, 23);
		frame.getContentPane().add(lblCard);
		
		JButton btCard = new JButton(" ");
		btCard.setBounds(449, 80, 88, 11);
		frame.getContentPane().add(btCard);
	}
}
