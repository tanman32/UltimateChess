/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.control;

import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Map;
import ultimatechess.UltimateChess;

/**
 *
 * @author manman
 */
public class MapControl {

    public static Map createMap() {
       //create the map
       Map map = new Map(20,20);
       
       //create a list of the different scenes in the game
       Scene[] scenes = createScenes();
       
       // assign the different scenes to locations in the map
       assignScenesToLocations(map, scenes);
       
       return map;
    }

    static void moveActorsToStartingLocation(Map map) {
      
    }

    private static Scene[] createScenes() {
    return null;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
       
  }

    private static class Scene {

        public Scene() {
        }
    }
    
}
