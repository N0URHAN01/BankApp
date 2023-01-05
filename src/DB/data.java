/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nour
 */
public class data {
   
  public static void insert(String idtype,String idnumber,String accnumber,String phonenum ,String mail,String umame,String pass){
      try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp","root","12345");
             Statement s = c.createStatement();
             s.execute(String.format("insert into signup values('%s','%s','%s','%s','%s','%s','%s')",idtype, idnumber,accnumber,phonenum,mail,umame,pass));
            
                 
             
             
             s.close();
             c.close();
             System.out.println("added");
           
        } catch (Exception ex) {
            System.out.println("class error");
            JOptionPane.showMessageDialog(null, ex);
        }
  }
      public static void insertc(String accountnum, String cheq){
      try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp","root","12345");
             Statement s = c.createStatement();
             s.execute(String.format("insert into cheq_r values('%s','%s')",cheq , accountnum));
           
             s.close();
             c.close();
           JOptionPane.showMessageDialog(null, "Done");
        } catch (Exception ex) {
            System.out.println("class error");
            JOptionPane.showMessageDialog(null, ex);
        }
}
  
  
  public static void insert(String data,String amount,String recv,String sender){
      try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp","root","12345");
             Statement s = c.createStatement();
             s.execute(String.format("insert into transfer values('%s','%s','%s','%s')",data,amount, recv, sender));
            
                 
             
             
             s.close();
             c.close();
             System.out.println("added");
           
        } catch (Exception ex) {
            System.out.println("class error");
            JOptionPane.showMessageDialog(null, ex);
        }
      
}
  
   
  
                         
         
         
}
  
   


