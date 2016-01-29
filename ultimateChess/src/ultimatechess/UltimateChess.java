/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatechess;

import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Inventory;
import byui.cit260.ultimateChess.model.Player;

/**
 *
 * @author Tanman
 */
public class UltimateChess {

    /**
     * @param args the command line arguments
     */
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
        
 
    }
    
}
