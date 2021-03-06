/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.control.GameControl;
import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Inventory;
import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Map;
import java.util.Scanner;
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
              + "\nA - View list of actors"
              + "\nL - View contents of location"
              + "\nM - Move person to new location"  
              + "\nE - Estimate the resource needed"  
              + "\nT - Open Gate" 
              + "\nD - Open Gate 2"
              + "\nH - Help" 
              + "\nP - Print Actor"  
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
            case "I":
                this.viewInventory();
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
             case "P":
                this.print();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;        
        }
        
        
        return false;
    }
     
    private void viewMap() {
     
      //get the map locations from the current game
      Location[][] locations = UltimateChess.getCurrentGame().getMap().getLocations();
      //DISPLAY title
      this.console.println("This is map of Ultimate Chess");
      //DISPLAY row of column numbers
      this.console.println("    | 0 | | 1 | | 2 | | 3 | | 4 | | 5 | | 6 |");
     //FOR every row in map
     for (int r = 0; r < 21; r++){
        this.console.print("\n----------------------------------------------" +
                             "\n" + r);
     for (int c = 0; c < 7; c++){
        this.console.print("  |  " +locations[r][c].getScene().getMapSymbol());  
        
     }
   
     }
       
     System.out.print("\n\nX- Path"
             + "\nC- Challenge"
             + "\nP- Power-up"
             + "\n?- Clue"
             + "\nT- Potion"
             + "\nG- Gate"
             + "\nR- Riddle"
             + "\nM- Maze"
             + "\nI- Start"
             + "\nF- Finish"
             + "\n*-Null");
    }
    
      
      Game game = UltimateChess.getCurrentGame();
      Map map = game.getMap();

    private void viewInventory() {
        StringBuilder line;
        
        Game game = UltimateChess.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        
        this.console.println("\n     LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                         ");
        line.insert(0, "DESCRIPTION");
        line.insert(30, "IN STOCK");
        this.console.println(line.toString());
        
        for (Inventory item : inventory) {
        line = new StringBuilder("                         ");
        line.insert(0, item.getDescription());
        line.insert(30,item.getQuantityInStock());
        
        this.console.println(line.toString());
        
        }
    }

    private void viewActors() {
        //get all object from the Actor enum
        Actor[] actorDescription = Actor.values();
        
        for (Actor description : actorDescription){
        this.console.println(description.getDescription());
        }
    }

    private void viewLocation() {

        this.console.println("\n*** viewLocation function called ***");

         AccessView accessLocations = new AccessView();
       accessLocations.display();

    }

    private void movePerson() {
       
        
       
        
        Location[][] locations = UltimateChess.getCurrentGame().getMap().getLocations();
    
         String[][] myArray = new String[21][21] ;
         
        
     //Start while loop
     int counter = 0;
     while(counter == 0){
         
          System.out.println("\n");
       Scanner reader = new Scanner(System.in);
        System.out.println("Enter a row: ");
        int ro = reader.nextInt(); 
        System.out.println("Enter a column: ");
        int co = reader.nextInt(); 
        
        if (locations[ro][co].getScene().getMapSymbol() == "*")
        {
            System.out.println("Invalid locaton");
        }
        else
        {
            
        
      
        
     for (int r = 0; r < 21; r++){
        System.out.println("\n----------------------------------------------" +
                             "\n" + r);
     for (int c = 0; c < 7; c++){
        if (myArray[r][c] == "L")
        {
            System.out.print("  |  " + myArray[r][c]);
        }
        else
        {
            System.out.print("  |  " +locations[r][c].getScene().getMapSymbol());
        }
     }
    }
        }
        
      
        System.out.println("\n");
       Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 to quite or keep moving locations:");
        int t = in.nextInt(); 
        System.out.println(t);
        if (t == 3)
        {
            counter++;
        }
       
     }
  
  
    }
    private void EstimateResource() {
        this.console.println("\n*** EstimateResource function called ***");
    }

    private void help() {
         //create help menu view object
        HelpMenuView helpMenu = new HelpMenuView();
       
        //display help menu view object
        helpMenu.display();
    }

    private void openGate() {
       GateControlOneView gateToOpenView = new GateControlOneView();
      
       //Not ideal but needed this so the message wouldn't have the show up 
       //multiple times.
        System.out.println( "\nIf you know what the resistance and current"
                 + "\nyou can solve for the voltage. Knowing the voltage will "
                 + "\nallow you to open this gate\n"
                 + "\nPlease enter the resistance: ");
       gateToOpenView.display();
               
    }
    
    private void openGate2() {
        
        codeToBreakView codeToBreakViewOpen = new codeToBreakView();
        codeToBreakViewOpen.display();          
    }

   
    private void print() {
        
      this.console.println("\n\nEnter the file path for file where the game"
                           +"is to be saved.");
      
       String filePath = this.getInput();
       
       try {
           // save the game to the speciried file
           GameControl.print(Actor.values(), filePath);
           this.console.println("\n The Description have been printed");
       }catch (Exception ex) {
           ErrorView.display("GameMenuView", ex.getMessage());
       }
    
    
    
    
}
    

}
    

