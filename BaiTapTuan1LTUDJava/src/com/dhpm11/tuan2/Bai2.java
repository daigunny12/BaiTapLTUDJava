package com.dhpm11.tuan2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai2 extends JFrame {
	public Bai2(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		JPanel pnFlow = new JPanel();
		pnFlow.setLayout(new FlowLayout());
		pnFlow.setBackground(Color.pink);
		JButton btn1 = new JButton("FlowLayout");
		JButton btn2 = new JButton("Add các control");
		JButton btn3 = new JButton("Trên 1 dòng");
		JButton btn4 = new JButton("hết chỗ chứa");
		JButton btn5 = new JButton("thì xuống dòng");
		pnFlow.add(btn1);
		pnFlow.add(btn2);
		pnFlow.add(btn3);
		pnFlow.add(btn4);
		pnFlow.add(btn5);
		Container con = getContentPane();
		con.add(pnFlow);
	}

	public static void main(String[] args) {
		Bai2 b2 = new Bai2("Demo FlowLayout");

	}

}
