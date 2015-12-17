import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Program {

	public static void main(String[] args) {
		Logic l1 = new Logic(0);
	//	Logic l2 = new Logic(3);
	//	Logic l3 = new Logic(120);
		
		JFrame frame = new JFrame("GUI demonstration w/ Logic");
	
		MyButton b = new MyButton(l1);
		MyButton2 b2 = new MyButton2(l1);
		
		JLabel label1 = new JLabel("Test", JLabel.CENTER);
		JButton button1 = new JButton("Logic 1: increase");
		JButton button2 = new JButton("Logic 1: decrease");
		
		JButton button3 = new JButton("Logic 1: increase amount");
		JButton button4 = new JButton("Logic 1: decrease amount");
		
		button1.addActionListener(b);
		button2.addActionListener(b);
		
		button3.addActionListener(b2);
		button4.addActionListener(b2);
		
		frame.getContentPane().add(label1, BorderLayout.CENTER);
		
		frame.getContentPane().add(button1, BorderLayout.WEST);
		frame.getContentPane().add(button2, BorderLayout.EAST);
		
		frame.getContentPane().add(button3, BorderLayout.NORTH);
		frame.getContentPane().add(button4, BorderLayout.SOUTH);
		
		frame.pack();
		
		frame.setVisible(true);
		
		
	}

}
