/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nour
 */
public class BankApp {

    /**
     * @param args the command line arguments
     */
   
      
    public static void main(String[] args) {
       loginpage l = new loginpage();
        l.setVisible(true);
        l.setResizable(false);
        l.setLocation(100,100);
       // signup s = new signup();
       // s.setVisible(true);
        
    }
}
