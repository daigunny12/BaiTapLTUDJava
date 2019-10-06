/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.tuan4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.dhpm11.tuan4.Suppliers;
/**
 *
 * @author Admin
 */
public class DAO {
    private Connection conn;
    
    public DAO(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=BooksSuppliers;"
            + "username=sa;password=sa");
        } catch (Exception e) {
            e.printStackTrace();   
        }
    }
    public boolean addSuppliers (Suppliers s){
        String sql = "insert into Books values (?,?,?,?,?,?)";
        try {
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.setString(1, s.getName());
           ps.setString(2, s.getType());
           ps.setString(3, s.getAddress());
           ps.setString(4, s.getContact());
           ps.setString(5, s.getEmail());
           ps.setString(6, s.getRemarks());
           
           return ps.executeUpdate() > 0;
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
}
    
    public  ArrayList<Suppliers> getListSuppliers(){
        ArrayList<Suppliers> list = new ArrayList<>();
        String sql = "select *from Books";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Suppliers s = new Suppliers();
                s.setID(rs.getString("ID"));
                s.setName(rs.getString("Name"));
                s.setType(rs.getString("Type"));
                s.setAddress(rs.getString("Address"));
                s.setContact(rs.getString("Contact"));
                s.setEmail(rs.getString("Email"));
                s.setRemarks(rs.getString("Remarks"));
                
                list.add(s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
 public  boolean DeleteData(Suppliers s){
     String sql = "Delete Books where ID =?";
     try {
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, s.getID() );
         
         return ps.executeLargeUpdate()>=0;
     } catch (Exception e) {
         e.printStackTrace();
     }
     
     return false;
 }
 
 public boolean UpDateData(Suppliers s){
     String sql = "update Books set Name =?, Type =?, Address =?,Contact =?, Email =?, Remarks =? where ID =?";
     try {
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, s.getName());
         ps.setString(2, s.getType());
         ps.setString(3, s.getAddress());
         ps.setString(4, s.getContact());
         ps.setString(5, s.getEmail());
         ps.setString(6, s.getRemarks());
         ps.setString(7, s.getID());
         
         return ps.executeUpdate()>=0;
     } catch (Exception e) {
         e.printStackTrace();
     }
     
     return  false;
 }
}
