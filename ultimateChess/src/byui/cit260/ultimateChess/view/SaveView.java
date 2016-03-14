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
                System.out.println("\n*** Invalid selection *** Try again");
                break;        
        }
        return false;
         }
    private void yes() {
        System.out.println("\n*** Your Game Saved ***");
    }
    

    private void no() {
        //create help menu view object
        MainMenuView mainmenu = new MainMenuView();
       
        //display help menu view object
        mainmenu.display();
    }
    }
