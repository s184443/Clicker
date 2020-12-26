package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import model.Basics;

public class Main {
	public static Basics basic = new Basics();
	
	public static void main(String[] args) {
		final JFrame main = new JFrame("Clicker");
		
		JPanel clickScreen = new JPanel();
		clickScreen.setPreferredSize(new Dimension(500,300));
		clickScreen.setLayout(new BorderLayout());

		JLabel total = new JLabel(Integer.toString(basic.getTotal()));
		JButton click = new JButton("Click here");
		click.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				basic.incrementTotal(basic.getClickAmount());
				System.out.println(basic.getTotal());
				total.setText(Integer.toString(basic.getTotal()));
			}
		});

		clickScreen.add(total, BorderLayout.CENTER);
		clickScreen.add(click, BorderLayout.SOUTH);
		
		//Add new buildings here!!
		JPanel buyScreen = new JPanel();
		JButton build1 = new JButton("placeholder");
		JButton build2 = new JButton("placeholder");
		buyScreen.setLayout(new GridLayout(2,0));
		buyScreen.add(build1);
		buyScreen.add(build2);
		
		main.add(clickScreen, BorderLayout.WEST);
		main.add(buyScreen, BorderLayout.EAST);
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.pack();
		main.setVisible(true);
		
	}
}
