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
        Player playerOne = new Player();
        playerOne.setName("Fred Flinstone");
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Game gameOne = new Game();
        gameOne.setGatesUnlocked(7.25);
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Actor actorOne = new Actor();
        actorOne.setName("taylor");
        actorOne.setDescription("taylor");
        actorOne.setCoordinates("taylor");
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        Inventory inventoryOne = new Inventory();
        inventoryOne.setPotionNum(123);
        inventoryOne.setPowerUpNum(123);
        inventoryOne.setClueNumCollected(123);
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
        Journal journalOne = new Journal();
        journalOne.setUseDescription("ABC");
        journalOne.setLocationOfclue("ABC");
        journalOne.setClueDirectory("ABC");
        String journalInfo = journalOne.toString();
        System.out.println(journalInfo);
 
        Location locationOne = new Location();
        locationOne.setRow(123);
        locationOne.setColumn(123);
        locationOne.setSpecialLocation("ABC");
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        Map mapOne = new Map();
        mapOne.setRowCount(123);
        mapOne.setColumnCount(123);
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Potions potionsOne = new Potions();
        potionsOne.setUseDescription("ABC");
        potionsOne.setPotionChanges("ABC");
        String potionsInfo = potionsOne.toString();
        System.out.println(potionsInfo);
        
        PowerUps powerupsOne = new PowerUps();
        powerupsOne.setUseDescription("ABC");
        powerupsOne.setPowerUpAddition("ABC");
        String powerupsInfo = powerupsOne.toString();
        System.out.println(powerupsInfo + "\n");
        
        //create StartProgramViewOrig and display the start program view
        StartProgram startProgram = new StartProgram();
         startProgram.startProgram();
         startProgram.displayStartProgramView();
     
        
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
