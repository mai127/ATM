import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class ATM_GUI {

	public static void main(String[] args) {
		
		  // Create the frame
		JFrame frame = new JFrame("ATM");
		  // Main frame settings 
		frame.setSize(300, 300);
		frame.setLocation(500,200);
		
		  // Create additional JPanels
		JPanel monitor = new JPanel();
		JPanel keypad = new JPanel();
		JPanel options = new JPanel();
		
		monitor.setPreferredSize(new Dimension(150,50));
		monitor.add(BorderLayout.CENTER, new JTextArea("Monitor"));
		
		  // keypad JPanel settings
		keypad.setPreferredSize(new Dimension(180,250));
		keypad.setBackground(Color.gray);
		  
		  // create JButtons for keypad 
		  // [1-3]
		JButton bt1 = new JButton("1");
		bt1.setPreferredSize(new Dimension(45, 45));
		keypad.add(bt1);
		JButton bt2 = new JButton("2");
		bt2.setPreferredSize(new Dimension(45, 45));
		keypad.add(bt2);
		JButton bt3 = new JButton("3");
		bt3.setPreferredSize(new Dimension(45, 45));
		keypad.add(bt3);
		  // [4-6]
		JButton bt4 = new JButton("4");
		bt4.setPreferredSize(new Dimension(45, 45));
		keypad.add(bt4);
		JButton bt5 = new JButton("5");
		bt5.setPreferredSize(new Dimension(45, 45));
		keypad.add(bt5);
		JButton bt6 = new JButton("6");
		bt6.setPreferredSize(new Dimension(45, 45));
		keypad.add(bt6);
		  //[7-9]
		JButton bt7 = new JButton("7");
		bt7.setPreferredSize(new Dimension(45, 45));
		keypad.add(bt7);
		JButton bt8 = new JButton("8");
		bt8.setPreferredSize(new Dimension(45, 45));
		keypad.add(bt8);
		JButton bt9 = new JButton("9");
		bt9.setPreferredSize(new Dimension(45, 45));
		keypad.add(bt9);
		  // [0]
		JButton btn1 = new JButton();
		btn1.setPreferredSize(new Dimension(45, 45));
		keypad.add(BorderLayout.CENTER, btn1);
		JButton bt0 = new JButton("0");
		bt0.setPreferredSize(new Dimension(45, 45));
		keypad.add(BorderLayout.CENTER, bt0);
		JButton btn2 = new JButton();
		btn2.setPreferredSize(new Dimension(45, 45));
		keypad.add(BorderLayout.CENTER, btn2);
		/*
		JButton btn;
		for (int i=1; i<4; i++) {
	        for (int j=1; j<5; j++) {
	            btn = new JButton();
	            btn.setPreferredSize(new Dimension(45, 45));
	            keypad.add(btn);
	        }
	    }
		*/
		
		  // JPanel settings
		options.setPreferredSize(new Dimension(150,200));
		options.setBackground(Color.red);
		  // create JButtons for options
		JButton cancel = new JButton("Cancel");
		cancel.setPreferredSize(new Dimension(100,30));
		options.add(cancel);
		
		JButton clear = new JButton("Clear");
		clear.setPreferredSize(new Dimension(100,30));
		options.add(clear);
		
		JButton enter = new JButton("Enter");
		enter.setPreferredSize(new Dimension(100,30));
		options.add(enter);
		
		
		
		
		
		  // Add all Panels on a JFrame
		frame.add(monitor, BorderLayout.NORTH);
		frame.add(keypad, BorderLayout.WEST);  
		frame.add(options, BorderLayout.CENTER);
		
		  // show the frame
		frame.setVisible(true);
				
	}
}
