/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zas
 */
public class loginpageTest {
    
    public loginpageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of loginpage method, of class loginpage.
     */
    @Test
    public void testLoginpage() {
        System.out.println("loginpage");
        String username = "alaa";
        String password = "2652312";
        boolean expResult = true ;
        boolean result = loginpage.loginpage(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testLoginpage1() {
        System.out.println("loginpage");
        String username = "nour";
        String password = "255155155";
        boolean expResult = true ;
        boolean result = loginpage.loginpage(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class loginpage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        loginpage.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
