package com.dhpm11.tuan3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;

public class demo extends JFrame {

	private JPanel contentPane;
	private Panel pnTren;
	private Panel pnDuoi;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btn2;
	private JButton btnNewButton_3;
	private JButton btn1;
	private JButton btn6;
	private JButton btn3;
	private JButton btnNewButton_8;
	private JButton btn5;
	private JButton btn4;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton button_5;
	private JButton button_6;
	private JButton btn0;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JTextField txtManHinh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo frame = new demo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnBorder = new JPanel();
		pnBorder.setToolTipText("");
		contentPane.add(pnBorder, BorderLayout.CENTER);
		pnBorder.setLayout(new BorderLayout(0, 0));
		
		pnTren = new Panel();
		pnBorder.add(pnTren, BorderLayout.NORTH);
		
		txtManHinh = new JTextField();
		txtManHinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtManHinh.setSize(50, 50);
		GroupLayout gl_pnTren = new GroupLayout(pnTren);
		gl_pnTren.setHorizontalGroup(
			gl_pnTren.createParallelGroup(Alignment.LEADING)
				.addComponent(txtManHinh, GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
		);
		gl_pnTren.setVerticalGroup(
			gl_pnTren.createParallelGroup(Alignment.LEADING)
				.addComponent(txtManHinh, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
		);
		pnTren.setLayout(gl_pnTren);
		
		pnDuoi = new Panel();
		pnBorder.add(pnDuoi, BorderLayout.CENTER);
		pnDuoi.setLayout(new GridLayout(4, 5, 0, 0));
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pnDuoi.add(btn1);
		
		btn2 = new JButton("2");
		pnDuoi.add(btn2);
		
		btn3 = new JButton("3");
		pnDuoi.add(btn3);
		
		btnNewButton_8 = new JButton("New button");
		pnDuoi.add(btnNewButton_8);
		
		btnNewButton_1 = new JButton("New button");
		pnDuoi.add(btnNewButton_1);
		
		btn4 = new JButton("4");
		pnDuoi.add(btn4);
		
		btn5 = new JButton("5");
		pnDuoi.add(btn5);
		
		btn6 = new JButton("6");
		pnDuoi.add(btn6);
		
		btnNewButton = new JButton("New button");
		pnDuoi.add(btnNewButton);
		
		btnNewButton_3 = new JButton("New button");
		pnDuoi.add(btnNewButton_3);
		
		btn7 = new JButton("7");
		pnDuoi.add(btn7);
		
		btn8 = new JButton("8");
		pnDuoi.add(btn8);
		
		btn9 = new JButton("9");
		pnDuoi.add(btn9);
		
		button_5 = new JButton("New button");
		pnDuoi.add(button_5);
		
		button_6 = new JButton("New button");
		pnDuoi.add(button_6);
		
		button_8 = new JButton("New button");
		pnDuoi.add(button_8);
		
		btn0 = new JButton("0");
		pnDuoi.add(btn0);
		
		button_9 = new JButton("New button");
		pnDuoi.add(button_9);
		
		button_10 = new JButton("New button");
		pnDuoi.add(button_10);
		
		button_11 = new JButton("New button");
		pnDuoi.add(button_11);
	}
}
