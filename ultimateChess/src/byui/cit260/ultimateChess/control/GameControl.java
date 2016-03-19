/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.control;

import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Inventory;
import byui.cit260.ultimateChess.model.Map;
import byui.cit260.ultimateChess.model.Player;
import byui.cit260.ultimateChess.model.Scene;
import ultimatechess.UltimateChess;


/**
 *
 * @author Tanman
 */
public class GameControl {

    public static Player createPlayer(String name) {
       
        
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        UltimateChess.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
       Game game = new Game(); //creates new game
       UltimateChess.setCurrentGame(game); //Save Ultimate Chess
       
       game.setPlayer(player); //save player in game
       
       // create the inventory list and save in the game
       Inventory[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
       
       Map map = MapControl.createMap(); //create and intialize new map
       game.setMap(map); // save the map in the game
//       MapControl.moveActorsToStartingLocation(map); // move actors to starting
       // location in map
       
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
     
    }

    public enum Item{
        potion,
        powerup,
        journalclue;
    }
    private static Inventory[] createInventoryList() {
        
        // created array(list) of inventory items
        Inventory[] inventory = new Inventory[3];
        
        Inventory potion = new Inventory();
        potion.setDescription("potion");
        potion.setQuantityInStock(0);
        inventory[Item.potion.ordinal()] = potion;
        
        Inventory powerup = new Inventory();
        powerup.setDescription("powerup");
        powerup.setQuantityInStock(0);
        inventory[Item.powerup.ordinal()] = powerup;
        
        Inventory journalclue = new Inventory();
        journalclue.setDescription("journalclue");
        journalclue.setQuantityInStock(0);
        inventory[Item.journalclue.ordinal()] = journalclue;
        
        return inventory;
    }

    
    
}
