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
        
        return false;
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
    
    void displayMenu() {
        System.out.println("\n*** displayMenu function called ***");
    }

}