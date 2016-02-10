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
        double height = 50.0;
        double base = 100.0;
        GateControl instance = new GateControl();
        double expResult = 2500.0;
        double result = instance.calCodeToBreak(height, base);
        assertEquals(expResult, result,.0001);
        
        System.out.println("testcase2");
        double height2 = -1.0;
        double base2 = 100.0;
        GateControl instance2 = new GateControl();
        double expResult2 = -1.0;
        double result2 = instance2.calCodeToBreak(height2, base2);
        assertEquals(expResult2, result2, 0.0001);
       
         System.out.println("testcase3");
        double height3 = 200.0;
        double base3 = -2;
        GateControl instance3 = new GateControl();
        double expResult3 = -2;
        double result3 = instance3.calCodeToBreak(height3, base3);
        assertEquals(expResult3, result3, 0.0001);
        
         System.out.println("testcase4");
        double height4 = 2000.0;
        double base4 = 250000.0;
        GateControl instance4 = new GateControl();
        double expResult4 = -2;
        double result4 = instance4.calCodeToBreak(height4, base4);
        assertEquals(expResult4, result4, 0.0001);
        
         System.out.println("testcase5");
        double height5 = 300000.0;
        double base5 = 5000.0;
        GateControl instance5 = new GateControl();
        double expResult5 = -1.0;
        double result5 = instance5.calCodeToBreak(height5, base5);
        assertEquals(expResult5, result5, 0.0001);
        
         System.out.println("testcase6");
        double height6 = 1.0;
        double base6 = 12.0;
        GateControl instance6 = new GateControl();
        double expResult6 = 6.0;
        double result6 = instance6.calCodeToBreak(height6, base6);
        assertEquals(expResult6, result6, 0.0001);
        
         System.out.println("testcase7");
        double height7 = 24.0;
        double base7 = 1.0;
        GateControl instance7 = new GateControl();
        double expResult7 = 12.0;
        double result7 = instance2.calCodeToBreak(height7, base7);
        assertEquals(expResult7, result7, 0.0001);
        
         System.out.println("testcase8");
        double height8 = 10000.0;
        double base8 = 2.0;
        GateControl instance8 = new GateControl();
        double expResult8 = 10000.0;
        double result8 = instance8.calCodeToBreak(height8, base8);
        assertEquals(expResult8, result8, 0.0001);
    }
    
}
