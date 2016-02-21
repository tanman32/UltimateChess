/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.ultimateChess.view;

/**
 *
 * @author Tanman
 */
public class HelpMenu {
    private String menu;
    private String promptMessage;
    public HelpMenu()
     {
         this.menu = "\n"
              + "\n---------------------------"
              + "\n| Help Menu               |"
              + "\nG - What is the goal of the Game"
              + "\nM - How to move"
              + "\nS - Skills "
              + "\nQ - Quit"
              + "\n---------------------------";
    
     }
    public void displayHelpMenu() {
        boolean done = false;
        do {
            // prompt for and get players
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            //do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
         
         return "N";
    } 
        private boolean doAction(String choice) {
            choice = choice.toUpperCase();
        
        switch (choice){
            case "G":
                this.goalOfGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "S":
                this.skill();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
            
        }
        
        System.out.println("\n*** doAction() function called ***");
        return true;
    }

    private void goalOfGame() {
        System.out.println("\n*** goalOfGame function called ***");
    }

    private void howToMove() {
        System.out.println("\n*** howToMove function called ***");
    }

    private void skill() {
        System.out.println("\n*** skill function called ***");
    }

}