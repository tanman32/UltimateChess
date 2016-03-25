/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.view.ErrorView;
import byui.cit260.ultimateChess.view.StartProgram;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tanman
 */
public class StartProgramTest {
    
    public StartProgramTest() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of displayBanner method, of class StartProgram.
     */
    @Test
    public void testDisplayBanner() {
        ErrorView.display(this.getClass().getName(),"displayBanner");
        StartProgram instance = new StartProgram();
        //instance.displayBanner();
   
    }

    /**
     * Test of startProgram method, of class StartProgram.
     */
    @Test
    public void testStartProgram() {
        ErrorView.display(this.getClass().getName(),"startProgram");
        StartProgram instance = new StartProgram();
        //instance.startProgram();
       
    }
    
}
