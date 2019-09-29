package com.dhpm11.tuan3;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class demoTable extends JFrame {
public demoTable(String tile) {
	super(tile);
	setSize(500,400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	table();
	setVisible(true);
}
public void table() {
	JPanel jpn = new JPanel();
	jpn.setLayout(new BorderLayout());
	
	DefaultTableModel dm  = new DefaultTableModel();
	dm.addColumn("Mã");
	dm.addColumn("Tên");
	dm.addColumn("Tuổi");
	
	final JTable tbl = new JTable(dm);
	dm.addRow(new String[] {"112","Ngô Văn Bắp","21"});
	dm.addRow(new String[] {"113","Nguyễn Thị Tí","18"});
	dm.addRow(new String[] {"114","Trần Văn Tèo","22"});
	
	JScrollPane sc= new JScrollPane(tbl);
	Container con = getContentPane();
	con.setLayout(new BorderLayout());
	con.add(sc, BorderLayout.CENTER);
}
	
	public static void main(String[] args) {
		demoTable dm = new demoTable("demo table");

	}

}
