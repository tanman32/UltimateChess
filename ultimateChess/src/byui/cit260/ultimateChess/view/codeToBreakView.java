/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.control.GateControl;
import java.util.Scanner;

/**
 *
 * @author taylor
 */
public class codeToBreakView extends View{
        
        public codeToBreakView() {
       
            super("    You will get your formula from the maze, if you\n"
                         + "complete the mission at the maze. If not you need to\n"
                         + "try again till you success.\n" 
                         + " You need to complete the challenge and get the height\n "
                         + "of triangle from the challenge. If not you need to try\n "
                         + "again till you success.\n" 
                         + "You will get the base of triangle from riddle, if you\n "
                         + "answer correct. If not you need to try again till you success.\n"
                         + "\nPlease enter the height of triangle: ");
    }

    @Override
    public boolean doAction(String value) {
       
        double height = Double.parseDouble(value);
        
        this.console.println("Please enter the base of triangle: ");
        
        String value2 = this.getInput();
        double base =  0;
        
        try {
        base = Double.parseDouble(value2);
         } catch (NumberFormatException nf) {
            System.out.println("\nThis isn't a valid number to use.");
        }
        
        double area = GateControl.calCodeToBreak(height, base);
        
        if (area != 200){
            this.console.println("\nBetter Luck next time. This isn't the"
                    + "\n right voltage to open the gate.");
            return false;
        }

        // display next view
        this.displayNextView(area);
        return true;
    }

    private void displayNextView(Double area) {
        this.console.println("\n===================================="
                + "\n Awesome! " + area
                + "\n is in fact the right area to"
                + "\n open the gate"
                + "\n==================================");
    }

    }
    



