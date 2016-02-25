/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.ultimateChess.view;

import java.util.Scanner;

/**
 *
 * @author Tanman
 */
public class HowToMoveView {
    private String menu;
    private String promptMessage; 
    public HowToMoveView()
     {
         this.menu = "\n"
              + "\n---------------------------"
              + "\n| Chess Move Menu         |"
              + "\nP -Pawn"
              + "\nR - Rooke"
              + "\nN - Knight"
              + "\nB - Bishop"
              + "\nQ - Queen"
              + "\nK - King"
              + "\nX - Quit"
              + "\n---------------------------";
    
     }
    public void displayHowToMoveView() {
        boolean done = false;
        do {
            // prompt for and get players
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X"))
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
             System.out.println("\n" + this.menu);
             
             value = keyboard.nextLine();
             value = value.trim();
             
             if (value.length() < 1) {
                 System.out.println("\nInvalid value: value can not be blank");
                 continue;
             }
             break;
         }
         
         return value;
         }
     
        private boolean doAction(String choice) {
            choice = choice.toUpperCase();
        
        switch (choice){
            case "P":
                this.pawn();
                break;
            case "R":
                this.rooke();
                break;
            case "N":
                this.knight();
                break;
            case "B":
                this.bishop();
                break;
           case "Q":
                this.queen();
                break;
            case "K":
                this.king();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break; 
        }
        
        return false;
    }

    private void pawn() {
        System.out.println("A pawn at the start can move one or two spaces"
                + "\nforward. If an opposing piece is infront, the pawn won't be"
                + "\nable to move forward, unless the opposing piece is "
                + "\ndiagonally aligned with the pawn in which case the pawn has"
                + "\nthe opportunity to take out the enemy piece. If the pawn"
                + "\ncan reach the opposite side of the gameboard it can change"
                + "\ninto a piece that has been taken out of play by your "
                + "\nopponent.");
    }

   private void rooke() {
        System.out.println("A rooke can move an infinite amount of spaces on"
                + "\nthe gameboard vertically or horizontally until it runs into"
                + "\nanother piece.");
    }
     
   private void knight() {
        System.out.println("A knight can jump pieces. A knight can move one"
                + "\nspace vertically or horizontally turn right or left and"
                + "\nthen two more spaces from there or a knight can move two"
                + "\nspace vertically or horizontally turn right or left and"
                + "\ntake one more move from there. A knight kills pieces by "
                + "\nlanding on them.");
    }
   private void bishop() {
        System.out.println("A bishop can move an infinite amount of spaces on"
                + "\nthe gameboard diagonally until it runs into"
                + "\nanother piece.");
    }
   private void queen() {
        System.out.println("A queen can move an infinite amount of spaces on"
                + "\nthe gameboard diagonally, verticall, horizontally"
                + "\nuntil it runs into another piece. She does it all.");
    }
   private void king() {
        System.out.println("The king can only move to a spot that is one "
                + "\nlocation away from him. A king must try his best to not be"
                + "\nin check. Check is where a king's life is threatened by "
                + "\nanother piece. If the king or the pieces can't get the king"
                + "\nout of check, the game over, check-mate!");
    }
}
