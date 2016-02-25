/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.control.GateControl;
import java.util.Scanner;

/**
 *
 * @author Tanman
 */
public class GateControlOneView {
   
     private String promptMessage;
     private String promptMessageTwo;     
  
   public GateControlOneView()
     {
         
     }

    public void gateControlOneView()
     {
          this.promptMessage = "Please enter the resistance: ";
          this.promptMessageTwo = "Please enter the current: ";
        
        this.displayBanner();
     
    }  
     public void displayBanner(){
        System.out.println("If you know what the resistance and current"
                + "\nyou can solve for the voltage. Knowing the voltage will "
                + "\nallow you to open this gate\n");
     }
     
      public void displayGateControlOneView() {
       
        boolean done = false;
        do {
            Double resistance = this.getResistance();
            Double current = this.getCurrent();
            if (resistance < 1 || resistance  > 1000)
                return;
          
            else if (current < 1 || current > 1000)
                return;
            
            done = this.doAction(resistance, current);
        } while (!done);
    }
         private Double getResistance() {
         Scanner keyboard = new Scanner(System.in);
         Double value = -1.0;
         boolean valid = false;
         
         while(!valid){
             System.out.println("\n" + this.promptMessage);
             
             value = keyboard.nextDouble();
             
              if (value < 1 || value > 1000) {
                System.out.println("\nInvalid value: Less than one; Greater "
                        + "\n than a thousand.");
                 continue;
        }
             break;
         }
         
         return value;
    }
         
          private Double getCurrent() {
         Scanner keyboard = new Scanner(System.in);
         Double value = -1.0;
         boolean valid = false;
         
         while(!valid){
             System.out.println("\n" + this.promptMessageTwo);
             
             value = keyboard.nextDouble();
             
              if (value < 1 || value > 1000) {
                System.out.println("\nInvalid value: Less than one; Greater "
                        + "\n than a thousand.");
                 continue;
        }
             break;
         }
         
         return value;
    }

    private boolean doAction(Double resistance, Double current) {
       
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
