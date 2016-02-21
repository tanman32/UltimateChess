/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.control.GameControl;

import java.util.Scanner;
import ultimatechess.UltimateChess;

/**
 *
 * @author Tanman
 */
public class MainMenuView {
    private String menu;
    private String promptMessage;
    public MainMenuView()
    {
         this.menu = "\n"
              + "\n---------------------------"
              + "\n| Main Menu               |"
              + "\nN - Start new game"
              + "\nG - Get and start saved game"
              + "\nH - Get help on how to play the game"
              + "\nS - Save game"
              + "\nQ - Quit"
              + "\n---------------------------";
    }
   
    public void displayMainMenuView() {
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
         Scanner keyboard = new Scanner(System.in);
         String value = "";
         boolean valid = false;
         
         while(!valid){
             System.out.println("\n" + this.promptMessage);
             
             value = keyboard.nextLine();
             value = value.trim();
             
             if (value.length() < 1) {
                 System.out.println("\nInvalid value: value can not be blank");
                 continue;
             }
             break;
         }
         
         return value;
             
       // System.out.println("\\n*** getPlayersName() called ***");
        // return "Joe";
    }
    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); 
        
        switch (choice){
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
            
        }
        
        System.out.println("\n*** doAction() function called ***");
        return true;
    }

    private void startNewGame() {
        System.out.println("\n*** startNewGame function called ***");
        
        //Creates a new game
        GameControl.createNewGame(UltimateChess.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
     System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
     System.out.println("\n*** displayHelpMenu function called ***");
    }

    private void saveGame() {
      System.out.println("\n*** saveGame function called ***");
    }
}