/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.control.GameControl;
import byui.cit260.ultimateChess.model.Player;
import java.util.Scanner;

/**
 *
 * @author Tanman
 */
public class StartProgram {
    private String promptMessage;
    
    public StartProgram() {
       
    }

    public void startProgram() {
        this.promptMessage = "Please enter your name: ";
        
        this.displayBanner();
     
    }  
     public void displayBanner(){
        System.out.println("    The game Ultimate Chess is going to be an adventure\n "
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
                         + "Challenge scenes.\n");
     }

    public void displayStartProgramView() {
        System.out.println("\n*** displayProgramView function called ***");
        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {
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
             
        //System.out.println("\\n*** getPlayersName() called ***");
        // return "Joe";
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2){
            System.out.println("\nInvalid players name: "
            + "The name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null){
            System.out.println("\nError creating the player.");
            return false;
        }
        System.out.println(playersName);
        
        // display next view
        this.displayNextView();
        return true;
        }

    private void displayNextView() {
        System.out.println("\\n*** displayNextView() called ***");
    }
}
