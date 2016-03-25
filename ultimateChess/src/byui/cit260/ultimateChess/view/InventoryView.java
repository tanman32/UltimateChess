/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

/**
 *
 * @author Tanman
 */
public class InventoryView extends View{
    
    public InventoryView()
     {
         super("\n"
              + "\n---------------------------"
              + "\n| Inventory Menu               |"
              + "\nP - Potions"
              + "\nU - Power-Ups"
              + "\nR - Riddles"
              + "\nQ - Quit"
              + "\n---------------------------");
    
     }
   
    @Override
        public boolean doAction(String choice) {
            choice = choice.toUpperCase();
        
        switch (choice){
            case "P":
                this.potions();
                break;
            case "U":
                this.power_ups();
                break;
            case "R":
                this.riddles();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break; 
        }
        
        return false;
    }

    private void potions() {
        this.console.println("\nWill display how many potions there are"
                + " and what type of potions that you have in stock along"
                + "with the description of what that potion does.");
    }

      private void power_ups() {
        this.console.println("\nWill display how many power-ups there are"
                + " and what type of power-ups that you have in stock along"
                + "with the description of what that power-up does.");
    }
    private void riddles() {
        this.console.println("\nWill display the riddle numbers that you"
                + "you have collected.");
    }
    
   

}