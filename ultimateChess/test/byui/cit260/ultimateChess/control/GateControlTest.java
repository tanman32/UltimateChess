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
    
     /**
     * Test of gateToOpen method, of class GateControl.
     */
    @Test
    public void gateToOpen() {
        System.out.println("gateToOpen");
        System.out.println("testcase1");
        double resistance = 30.0;
        double current = 20.0;
        GateControl instance = new GateControl();
        double expResult = 600.0;
        double result = instance.gateToOpen(resistance, current);
        assertEquals(expResult, result,.0001);
        
        System.out.println("testcase2");
        double resistance2 = 321.0;
        double current2 = -87.0;
        GateControl instance2 = new GateControl();
        double expResult2 = -4.0;
        double result2 = instance2.gateToOpen(resistance2, current2);
        assertEquals(expResult2, result2, 0.0001);
       
         System.out.println("testcase3");
        double resistance3 = 55;
        double current3 = 0;
        GateControl instance3 = new GateControl();
        double expResult3 = -4;
        double result3 = instance3.gateToOpen(resistance3, current3);
        assertEquals(expResult3, result3, 0.0001);
        
         System.out.println("testcase4");
        double resistance4 = 25678.0;
        double current4 = 3.0;
        GateControl instance4 = new GateControl();
        double expResult4 = -3;
        double result4 = instance4.gateToOpen(resistance4, current4);
        assertEquals(expResult4, result4, 0.0001);
        
         System.out.println("testcase5");
        double resistance5 = 3.0;
        double current5 = 53464.0;
        GateControl instance5 = new GateControl();
        double expResult5 = -4.0;
        double result5 = instance5.gateToOpen(resistance5, current5);
        assertEquals(expResult5, result5, 0.0001);
        
         System.out.println("testcase6");
        double resistance6 = 1000.0;
        double current6 = 1.0;
        GateControl instance6 = new GateControl();
        double expResult6 = 1000.0;
        double result6 = instance6.gateToOpen(resistance6, current6);
        assertEquals(expResult6, result6, 0.0001);
        
         System.out.println("testcase7");
        double resistance7 = 1.0;
        double current7 = 1000.0;
        GateControl instance7 = new GateControl();
        double expResult7 = 1000.0;
        double result7 = instance2.gateToOpen(resistance7, current7);
        assertEquals(expResult7, result7, 0.0001);
        
         System.out.println("testcase8");
        double resistance8 = 999.0;
        double current8 = 1.0;
        GateControl instance8 = new GateControl();
        double expResult8 = 999.0;
        double result8 = instance8.gateToOpen(resistance8, current8);
        assertEquals(expResult8, result8, 0.0001);
    }

    
}
