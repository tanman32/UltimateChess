/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.control.MapControl;

/**
 *
 * @author Tanman
 */

public class AccessView extends View{
        
        public AccessView() {
       
            super("    This will check to see if your at a valid location.\n"
                         + "The places you may go are listed below along with\n"
                        + " how many you may actually go to.");
    }

    @Override
    public boolean doAction(String value) {
       
        int row = Integer.parseInt(value);
        
        System.out.println("Please enter your row and column: ");
        
        String value2 = this.getInput();
        int column = Integer.parseInt(value2);
        
        boolean valid =  MapControl.checkLocation(row, column);
       
        if (valid != true){
            System.out.println("\nBetter Luck next time. These aren't"
                    + "\n valid location.");
            return false;
        }

        // display next view
        this.displayNextView();
        return true;
    }

    private void displayNextView() {
        System.out.println("\n===================================="
                + "\n Awesome! " + 0
                + "\n is in fact the right area to"
                + "\n open the gate"
                + "\n==================================");
    }

    }
    