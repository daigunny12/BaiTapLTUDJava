package com.dhpm11.tuan2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai3 extends JFrame {
	public Bai3(String title) {
		super(title);
		setSize(400, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		JPanel pnBox = new JPanel();
		//pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
		Font font = new Font("Arial", Font.BOLD / Font.ITALIC, 25);
		JButton btn1 = new JButton("BoxLayout");
		btn1.setForeground(Color.RED);
		btn1.setFont(font);
		pnBox.add(btn1);
		JButton btn2 = new JButton("X_AXIS");
		btn2.setForeground(Color.BLUE);
		btn2.setFont(font);
		pnBox.add(btn2);
		JButton btn3 = new JButton("Y_AXIS");
		btn3.setForeground(Color.RED);
		btn3.setFont(font);
		pnBox.add(btn3);

		Container con = getContentPane();
		con.add(pnBox);
	}

	public static void main(String[] args) {
		Bai3 b3 = new Bai3("Học BoxLayout");
	}

}
