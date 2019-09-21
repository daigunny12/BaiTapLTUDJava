package com.dhpm11.tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai4 extends JFrame {
	public Bai4(String title) {
		super(title);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addControl();
		setVisible(true);
	}

	public void addControl() {
		Font font = new Font("Arial", Font.BOLD / Font.ITALIC, 25);
		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());
		/// pnBorder.setBackground(Color.RED);

		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.RED);
		Label lbNorth = new Label("North");
		pnNorth.add(lbNorth);
		pnBorder.add(pnNorth, BorderLayout.NORTH);

		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.RED);
		Label lbSouth = new Label("South");
		pnSouth.add(lbSouth);
		pnBorder.add(pnSouth, BorderLayout.SOUTH);

		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.BLUE);
		pnWest.setToolTipText("WEST");
		Label lbWest = new Label("West");
		pnWest.add(lbWest);
		pnBorder.add(pnWest, BorderLayout.WEST);

		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.BLUE);
		Label lbEast = new Label("East");
		pnEast.add(lbEast);
		pnBorder.add(pnEast, BorderLayout.EAST);

		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.YELLOW);
		Label lbCenter = new Label("Center");
		pnCenter.add(lbCenter);
		pnBorder.add(pnCenter, BorderLayout.CENTER);

		getContentPane().add(pnBorder);
	}

	public static void main(String[] args) {
		new Bai4("BoxderLayout");

	}

}
