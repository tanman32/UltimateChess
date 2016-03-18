/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.control;

import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.model.Challenge;
import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Map;
import byui.cit260.ultimateChess.model.Move;
import java.awt.Point;
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


    private static Scene[] createScenes() {
    
        Scene[] scenes = new Scene[12];
        
        Challenge challenge1 = new Challenge();
        challenge1.setDescription("This is your first challenge.");
        challenge1.setMapSymbol("M");
        challenge1.setClue("The magic number is 42.");
        challenge1.setSceneNum(1);
        challenge1.setType("Challenge");
        
        //Get and populate Gameboard
        /*challenge1.setGameBoard(
                {
                    {"WK", "  ", "BP"," "," ", " ", " ", " "},
                    {"WK", "  ", "BP"," "," ", " ", " ", " "},
                    {"WK", "  ", "BP"," "," ", " ", " ", " "},
                    {"WK", "  ", "BP"," "," ", " ", " ", " "},
                    {"WK", "  ", "BP"," "," ", " ", " ", " "},
                    {"WK", "  ", "BP"," "," ", " ", " ", " "},
                    {"WK", "  ", "BP"," "," ", " ", " ", " "},
                    {"WK", "  ", "BP"," "," ", " ", " ", " "}
                });
        //Get and populate moves
        challenge1.getMoves().add(new Move("White Pawn", new Point (1,3)));
        challenge1.getMoves().add(new Move("White Knight", new Point (2,4)));
        scenes[0] = challenge1;*/
        return null;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
       Location[][] locations = map.getLocations();
        locations[0][0].setScene(scenes[SceneType.challenge.ordinal()]);
  }

    static void moveActorsToStartingLocation(Map map) {
      
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