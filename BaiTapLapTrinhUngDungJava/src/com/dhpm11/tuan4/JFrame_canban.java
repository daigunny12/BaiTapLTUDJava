package com.dhpm11.tuan4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class JFrame_canban extends JFrame{
    
    public  JFrame_canban(String title){
        super(title);
        setBackground(Color.yellow);
        setLocationRelativeTo(null);
        setSize(500,400);
        setForeground(Color.red);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JFrame_canban("Bai 1" );
    }
}
