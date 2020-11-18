import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest {
	
	
	
	
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
		
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Don't do that.");
			}
			
		});
		
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
