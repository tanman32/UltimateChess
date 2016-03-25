/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.control.GameControl;

import java.util.Scanner;
import ultimatechess.UltimateChess;

/**
 *
 * @author Tanman
 */
public class MainMenuView extends View{
    private String menu;
    private String promptMessage;
    public MainMenuView()
    {
         super("\n"
              + "\n---------------------------"
              + "\n| Main Menu               |"
              + "\nN - Start new game"
              + "\nG - Get and start saved game"
              + "\nH - Get help on how to play the game"
              + "\nS - Save game"
              + "\nQ - Quit"
              + "\n---------------------------");
        
    }
                      
    @Override
    //choice might have made more sense than value as the variable name
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); 
        
        switch (value){
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
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
      
    }

    private void startNewGame() {
            //Creates a new game
        GameControl.createNewGame(UltimateChess.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
     this.console.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        //create help menu view object
        HelpMenuView helpMenu = new HelpMenuView();
       
        //display help menu view object
        helpMenu.display();
    }

    private void saveGame() {
        
      this.console.println("\n\nEnter the file path for file where the game"
                           +"is to be saved.");
      
       String filePath = this.getInput();
       
       try {
           // save the game to the speciried file
           GameControl.saveGame(UltimateChess.getCurrentGame(), filePath);
       }catch (Exception ex) {
           ErrorView.display("MainMenuView", ex.getMessage());
       }
    
        
     //create help menu view object
        SaveView save = new SaveView();
       
        //display help menu view object
        save.display();
    }
    
    void displayMenu() {
        this.console.println("\n*** displayMenu function called ***");
    }
    
    private void startSavedGame() {
    
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\n Enter the file path for file where the game"
                            +" is to be saved");
        
        String filePath = this.getInput();
        
        try{
            // start a saved game
            GameControl.saveGame(UltimateChess.getCurrentGame(),filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    
   
    
    }
}
