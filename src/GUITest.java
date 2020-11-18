import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest {
	
	private static int counter = 0;
	
	private static ActionListener b1A = new  ActionListener(){
		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do that.");
		}
	};
	private static ActionListener b2A = new  ActionListener(){
		public void actionPerformed(ActionEvent e) {
			System.out.println("Leave the goats alone.");
		}
	};
	private static ActionListener b3A = new  ActionListener(){
		public void actionPerformed(ActionEvent e) {
			System.out.println("mokey.");
		}
	};
	private static ActionListener b4A = new  ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(counter>99) {
				System.out.println("Done");
			}
			else {
				counter++;
				JFrame badFrame = new JFrame("Good luck");
				badFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				badFrame.setSize(500,600);
				badFrame.setLocationRelativeTo(badFrame);
				badFrame.setVisible(true);
				badFrame.setTitle("Window number " + counter);
				
				actionPerformed(e);
			}
		}
	};
	private static final int HEIGHT = 150;
	private static final int WIDTH = 400;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Dark wave");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		
		JButton b1 = new JButton("Man who stare");
		JButton b2 = new JButton("at goats");
		JButton b3 = new JButton("at code monkeys");
		JButton b4 = new JButton("THIS BUTTON WILL BLOW UP THE CODE");
		
		
		
		b1.addActionListener(b1A);
		b2.addActionListener(b2A);
		b3.addActionListener(b3A);
		b4.addActionListener(b4A);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		//frame.pack();
		frame.setVisible(true);

		
	}
	
}
