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
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
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
            
            //do  the requested action and display the next view
            done = this.doAction(value);
        } while (!done);
    }
    
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false; 
        String value = null;
         
        //while a valid name has not been retrieved
         while(!valid){
             
             //prompt for the player's name
             System.out.println("\n" + this.displayMessage);
             
             //get the value entered from the keyboard
             value = keyboard.nextLine();
             value = value.trim();
             
             if (value.length() < 1) { // blank value entered
                 System.out.println("\n");
                 continue;
             }
             break;
         }
}
