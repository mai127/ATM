import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;


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
		textField.setBounds(109, 26, 335, 134);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(133, 183, 45, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setBounds(183, 183, 45, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBounds(233, 183, 45, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(133, 217, 45, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(183, 217, 45, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setBounds(233, 217, 45, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.setBounds(233, 251, 45, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setBounds(183, 251, 45, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setBounds(133, 251, 45, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton(" ");
		button_8.setBounds(233, 287, 45, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.setBounds(183, 287, 45, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(" ");
		button_10.setBounds(133, 287, 45, 23);
		frame.getContentPane().add(button_10);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(306, 183, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(306, 217, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(306, 251, 89, 23);
		frame.getContentPane().add(btnEnter);
		
		JButton btnNewButton_2 = new JButton("Withdrawal");
		btnNewButton_2.setBounds(5, 26, 100, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.setBounds(5, 59, 100, 23);
		frame.getContentPane().add(btnDeposit);
		
		JButton btnBalance = new JButton("Balance");
		btnBalance.setBounds(5, 93, 100, 23);
		frame.getContentPane().add(btnBalance);
		
		JButton btnTransfer = new JButton("Transfer");
		btnTransfer.setBounds(5, 127, 100, 23);
		frame.getContentPane().add(btnTransfer);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 171, 483, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("CARD");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(449, 55, 88, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton(" ");
		btnNewButton_3.setBounds(449, 80, 88, 11);
		frame.getContentPane().add(btnNewButton_3);
	}
}
