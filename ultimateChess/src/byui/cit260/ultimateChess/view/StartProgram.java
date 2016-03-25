/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.control.GameControl;
import byui.cit260.ultimateChess.model.Player;

/**
 *
 * @author Tanman
 */
public class StartProgram extends View {
 
    public StartProgram() {
        super("    The game Ultimate Chess is going to be an adventure\n "
                         + "game. An evil overlord has taken your true love, your\n"
                         + "queen from you, because you refused to play silly games\n"
                         + "with him. Now you’re going to have to play his “Game”,\n"
                         + "or unbeknownst to you series of games, to rescue your\n"
                         + "gal back.\n"
                         + "\n"
                         + "    In this game you will have to rescue the Queen by\n"
                         + "moving around the board and overcoming a series of\n"
                         + "obstacles to reach her. You will need to collect clues\n"
                         + "from Challenges, Riddles, and Maze scenes to unlock\n"
                         + "gates to move to the next section of the game. You also\n"
                         + "can collect power-ups and potions that will be useful in\n"
                         + "Challenge scenes.\n"
                         + "\nWhat is your name? ");
    }
        
 
    @Override
    public boolean doAction(String playersName) {
       
        if (playersName.length() < 2){
            this.console.println("\nInvalid players name: "
            + "The name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null){
            this.console.println("\nError creating the player.");
            return false;
        }
        //this.console.println(playersName);
        
        // display next view
        this.displayNextView(playersName);
        return true;
        }

    private void displayNextView(String player) {
        this.console.println("\n===================================="
                          + "\n Welcome to the game " + player 
                          + "\n We hope you have a lot of fun!"
                          + "\n=================================="); 
        
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();  }
    
   
}
