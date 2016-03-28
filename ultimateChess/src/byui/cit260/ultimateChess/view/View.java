/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import ultimatechess.UltimateChess;

/**
 *
 * @author Tanman
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = UltimateChess.getInFile();
    protected final PrintWriter console = UltimateChess.getOutFile();

    public View() {
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        boolean done = false;
        do {
            //prompts for and gets players name
            String value = this.getInput();
            
            //Recently modified
            //You need to be able to exit the program and finish
              if (value.toUpperCase().equals("Q"))
                  return;
            //do  the requested action and display the next view
           try{
            done = this.doAction(value);
        } catch(NumberFormatException nf){
             this.console.println("Error! You must enter a NUMBER. Please try again.");
       }
    }
        
       while (!done);
    }
    
    @Override
    public String getInput() {
        
        boolean valid = false; 
        String value = null;
         try {
        //while a valid name has not been retrieved
         while(!valid){
             
             //prompt for the player's name

             this.console.println("\n" + this.displayMessage);

             System.out.println(this.displayMessage);

             
             //get the value entered from the keyboard
             value = this.keyboard.readLine();
             value = value.trim();
             
             if (value.length() < 1) { // blank value entered
                 this.console.println("\n*** You must enter a value ***");
                 continue;
             }
             break;
         }
         }catch (Exception e) {
             this.console.println("Error reading input: " + e.getMessage());
         }  
         return value; //returns the name
    }
}
