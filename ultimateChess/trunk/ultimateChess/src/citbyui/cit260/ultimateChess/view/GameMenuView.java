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
public class GameMenuView {
    private String menu;
    private String promptMessage;
    public GameMenuView()
    {
        this.menu = "\n"
              + "\n---------------------------"
              + "\n| Game Menu               |"
              + "\nV - View map"
              + "\nW - View list of items in weapons"
              + "\nA - View list of armies"
              + "\nL - View contents of location"
              + "\nM - Move person to new location"  
              + "\nE - Estimate the resource needed"  
              + "\nH - Help"  
              + "\nQ - Quit"
              + "\n---------------------------";
    
     }
    public void displayGameMenuView() {
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
            case "V":
                this.viewMap();
                break;
            case "W":
                this.viewWeapons();
                break;
            case "A":
                this.viewArmies();
                break;
            case "L":
                this.viewLocation();
                break;
            case "M":
                this.movePerson();
                break;
            case "E":
                this.EstimateResource();
                break;
            case "H":
                this.help();
                break;                    
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;        
        }
        
        
        return false;
    }
     
    private void viewMap() {
        System.out.println("\n*** viewMap function called ***");    
    }

    private void viewWeapons() {
        System.out.println("\n*** viewWeapons function called ***");
    }

    private void viewArmies() {
        System.out.println("\n*** viewArmies function called ***");
    }

    private void viewLocation() {
        System.out.println("\n*** viewLocation function called ***");
    }

    private void movePerson() {
        System.out.println("\n*** movePerson function called ***");
    }

    private void EstimateResource() {
        System.out.println("\n*** EstimateResource function called ***");
    }

    private void help() {
        System.out.println("\n*** help function called ***");
    }

   
    
}
    

