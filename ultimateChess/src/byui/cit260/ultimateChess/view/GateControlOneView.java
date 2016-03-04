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
 * @author Tanman
 */
public class GateControlOneView extends View{
       
  
   public GateControlOneView()
     {
         super("If you know what the resistance and current"
                 + "\nyou can solve for the voltage. Knowing the voltage will "
                 + "\nallow you to open this gate\n"
                 + "\n\nPlease enter the resistance: ");
     }

   @Override
    public boolean doAction(String value) {
       
        double resistance = Double.parseDouble(value);
        
        System.out.println("What is the current? ");
        
        String value2 = this.getInput();
        double current = Double.parseDouble(value2);
        
        double voltage = GateControl.gateToOpen(resistance, current);
        
        if (voltage != 100){
            System.out.println("\nBetter Luck next time. This isn't the"
                    + "\n right voltage to open the gate.");
            return false;
        }
        //System.out.println(playersName);

        // display next view
        this.displayNextView(voltage);
        return true;
    }

    private void displayNextView(Double voltage) {
        System.out.println("\n===================================="
                + "\n Eureka! " + voltage
                + "\n is in fact the right voltage to"
                + "\n open the gate"
                + "\n==================================");
    }
}
