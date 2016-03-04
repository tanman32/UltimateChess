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
public class HelpMenuView extends View{
    
    public HelpMenuView()
     {
         super("\n"
              + "\n---------------------------"
              + "\n| Help Menu               |"
              + "\nG - What is the goal of the Game"
              + "\nM - How to move"
              + "\nS - Skills "
              + "\nQ - Quit"
              + "\n---------------------------");
    
     }
   
    @Override
        public boolean doAction(String choice) {
            choice = choice.toUpperCase();
        
        switch (choice){
            case "G":
                this.goalOfGame();
                break;
            case "M":
                this.displayHowToMove();
                break;
            case "S":
                this.skill();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break; 
        }
        
        return false;
    }

    private void goalOfGame() {
        System.out.println("\nTo rescue the queen by completing a series of "
                + "obstacles and traversing the castle.");
    }

      private void displayHowToMove() {
        //create move menu view object
        HowToMoveView chessMove = new HowToMoveView();
       
        //display move menu view object
        chessMove.display();
    }
    private void skill() {
        System.out.println("\nAnything for now and exactly that.");
    }
    
   

}