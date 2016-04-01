/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.control.GameControl;
import ultimatechess.UltimateChess;

/**
 *
 * @author manman
 */
public class SaveView extends View {
     private String menu;
    private String promptMessage;
    public SaveView()
    {
        super("\n"
              + "\n---------------------------"
              + "\n| Do your want to save your game?|"
              + "\n| Please Enter y or n            | "          
              + "\n---------------------------");       
    }

    @Override
        public boolean doAction(String choice) {
            choice = choice.toUpperCase();
        
        switch (choice){
            case "Y":
                this.yes();
                break;
            case "N":
                this.no();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;        
        }
        return false;
         }
    private void yes() {
        this.console.println("\n\nEnter the file path for file where the game"
                           +"is to be saved.");
      
       String filePath = this.getInput();
       
       try {
           // save the game to the speciried file
           GameControl.saveGame(UltimateChess.getCurrentGame(), filePath);
       }catch (Exception ex) {
           ErrorView.display("MainMenuView", ex.getMessage());
       }
       
       this.console.println("\n*** Your Game Saved ***");
        //create help menu view object
        MainMenuView mainmenu = new MainMenuView();
       
        //display help menu view object
        mainmenu.display();
    }
    

    private void no() {
        //create help menu view object
        MainMenuView mainmenu = new MainMenuView();
       
        //display help menu view object
        mainmenu.display();
    }
    }
