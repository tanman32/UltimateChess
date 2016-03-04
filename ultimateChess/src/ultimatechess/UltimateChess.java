/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatechess;

import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Inventory;
import byui.cit260.ultimateChess.model.Journal;
import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Map;
import byui.cit260.ultimateChess.model.Player;
import byui.cit260.ultimateChess.model.Potions;
import byui.cit260.ultimateChess.model.PowerUps;
import citbyui.cit260.ultimateChess.view.GateControlOneView;
import citbyui.cit260.ultimateChess.view.StartProgram;


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
        startProgram.display();
        
     
         //create StartProgramViewOrig and display the start program view
         // Just taking a break for now
       // GateControlOneView enterGate = new GateControlOneView();
        // enterGate.gateControlOneView();
        // enterGate.displayGateControlOneView();
        
        
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
