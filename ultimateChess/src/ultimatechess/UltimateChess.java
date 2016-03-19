/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatechess;


import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Player;
import byui.cit260.ultimateChess.view.InventoryView;
import byui.cit260.ultimateChess.view.StartProgram;


/**
 *
 * @author Tanman
 */
public class UltimateChess {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        //create StartProgramViewOrig and display the start program view
        StartProgram startProgram = new StartProgram();
      try{  
        startProgram.display();
      } catch (Throwable te) { 
        System.out.println(te.getMessage());
        te.printStackTrace();
        startProgram.display(); 
    }
    
    }
     

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        UltimateChess.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        UltimateChess.player = player;
    }
    
}
