/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Map;
import ultimatechess.UltimateChess;

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
      
      Game game = UltimateChess.getCurrentGame();
      Map map = game.getMap();
      Location[][] locations = map.getLocations();
      
      for (int i = 0; i < 8; i++){
     
          System.out.println("");
          for(int j = 0; j < 8; j++)
          {
              System.out.print(" " + i);
          }
      }
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
    

