/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.ultimateChess.view;

import java.util.Scanner;

/**
 *
 * @author taylor
 */
public class codeToBreakView {
        private String promptMessage;
        
        public codeToBreakView() {
       
    }

    public void codeToBreakView() {
        this.promptMessage = "Please enter the height of triangle: ";
        this.promptMessage = "Please enter the base of triangle: ";

        this.displayBanner();
}

    private void displayBanner() {
        System.out.println("    You will get your formula from the maze, if you\n"
                         + "complete the mission at the maze. If not you need to\n"
                         + "try again till you success.\n" 
                         + " You need to complete the challenge and get the height\n "
                         + "of triangle from the challenge. If not you need to try\n "
                         + "again till you success.\n" 
                         + "You will get the base of triangle from riddle, if you\n "
                         + "answer correct. If not you need to try again till you success.\n");
     }
    public void displaycodeToBreakView() {
       
        boolean done = false;
        do {
            double answer = this.getAnswer();
                     
            done = this.doAction(answer);
        } while (!done);
    }
         
    private double getAnswer() {
        Scanner keyboard = new Scanner(System.in);
         String value = "";
         boolean valid = false;
         
         while(!valid){
             System.out.println("\n" + this.promptMessage);
             
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

    private boolean doAction(double answer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
    



