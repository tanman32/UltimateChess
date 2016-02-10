/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manman
 */
public class GateControlTest {
    
    public GateControlTest() {
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
     * Test of calCodeToBreak method, of class GateControl.
     */
    @Test
    public void testCalCodeToBreak() {
        System.out.println("calCodeToBreak");
        System.out.println("testcase1");
        double height = 10000.0;
        double base = .0;
        GateControl instance = new GateControl();
        double expResult = 5000.0;
        double result = instance.calCodeToBreak(height, base);
        assertEquals(expResult, result, 0.0);
       
        
    }
    
}
