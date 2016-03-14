/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.view.GateControlOneView;
import byui.cit260.ultimateChess.view.codeToBreakView;

/**
 *
 * @author Tanman
 */
public class GameMenuView extends View{
    
    public GameMenuView()
    {
        super("\n"
              + "\n---------------------------"
              + "\n| Game Menu               |"
              + "\nV - View map"
              + "\nW - View list of items in weapons"
              + "\nA - View list of actors"
              + "\nL - View contents of location"
              + "\nM - Move person to new location"  
              + "\nE - Estimate the resource needed"  
              + "\nT - Open Gate" 
              + "\nD - Open Gate 2"
              + "\nH - Help"  
              + "\nQ - Quit"
              + "\n---------------------------");
    
     }
     
    @Override
        public boolean doAction(String choice) {
            choice = choice.toUpperCase();
        
        switch (choice){
            case "V":
                this.viewMap();
                break;
            case "W":
                this.viewWeapons();
                break;
            case "A":
                this.viewActors();
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
             case "T":
                this.openGate();
                break;
             case "D":
                this.openGate2();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;        
        }
        
        
        return false;
    }
     
    private void viewMap() {
        System.out.println("\n---------------------------------------"
                         + "\n------------------Q--------------------"
                         + "\n------------------  -------------------"
                         + "\n------------------G--------------------"
                         + "\n------------------  -------------------" 
                         + "\n------------------  -------------------"
                         + "\n---pt-R                         M-pu---"
                         + "\n-----------------  --------------------" 
                         + "\n-----------------  --------------------"
                         + "\n------             --------------------"
                         + "\n------  ----------  -------------------"
                         + "\n------C-----------  -------------------"
                         + "\n------cl----------S--------------------" 
                         + "\n---------------------------------------");
    }

    private void viewWeapons() {
        System.out.println("\n*** viewWeapons function called ***");
    }

    private void viewActors() {
        //get all object from the Actor enum
        Actor[] actorDescription = Actor.values();
        
        for (Actor description : actorDescription){
        System.out.println(description.getDescription());
        }
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

    private void openGate() {
       GateControlOneView gateToOpenView = new GateControlOneView();
       gateToOpenView.display();
               
    }
    
    private void openGate2() {
       codeToBreakView codeToBreakViewOpen = new codeToBreakView();
       codeToBreakViewOpen.display();
               
    }

   
    
}
    

