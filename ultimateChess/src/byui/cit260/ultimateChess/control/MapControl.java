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

    public static int moveActorsToStartingLocation(Actor actor, Point coordinates) {
      
        Map map = UltimateChass.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
            newColumn < 0 || newColumn >= map.getNoOfColumns()) {    
            throw new MapcontrolException("Can not move actor to location "
                                          + coordinates.x "," + coordinates.y
                                          +" because that location is outside "
                                          +" the bounds of the map.");
    }
        
    }
    
    
    
    public static int moveActorsToStartingLocation(Map map) {
        // for every actor     
        throws MapControlException {
        Actor[] actor = actor.values();
        
        for (Actor actor : actors) {
            Point coordinstes = actor.getCoordinates();
            MapControl.moveActorsToStartingLocation(actor, coordinates);
    }
        
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



    /*public static int moveActorsToStartingLocation(Actor actor, Point coordinates) {
      
        Map map = UltimateChass.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
            newColumn < 0 || newColumn >= map.getNoOfColumns()) {    
            throw new MapcontrolException("Can not move actor to location "
                                          + coordinates.x "," + coordinates.y
                                          +" because that location is outside "
                                          +" the bounds of the map.");
    }
        return 0;
    }*/