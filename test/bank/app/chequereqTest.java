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
public class chequereqTest {
    
    public chequereqTest() {
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
     * Test of check method, of class chequereq.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        String acc_num = "20-212";
        String acc_balance = "55512";
        chequereq instance = new chequereq();
        boolean expResult = true;
        boolean result = instance.check(acc_num, acc_balance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheck1() {
        System.out.println("check");
        String acc_num = "20-215";
        String acc_balance = "500000";
        chequereq instance = new chequereq();
        boolean expResult = true;
        boolean result = instance.check(acc_num, acc_balance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheck2() {
        System.out.println("check");
        String acc_num = "20-214";
        String acc_balance = "5155";
        chequereq instance = new chequereq();
        boolean expResult = true;
        boolean result = instance.check(acc_num, acc_balance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class chequereq.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        chequereq.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
