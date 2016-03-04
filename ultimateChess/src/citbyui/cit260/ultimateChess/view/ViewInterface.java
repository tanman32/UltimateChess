/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.ultimateChess.view;



      //You don't need a class for interface
      //Allows these functions to be used throught out your program
    public interface ViewInterface {
            public void display();
            public String getInput();
            public boolean doAction(String Value);
        }
