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
import byui.cit260.ultimateChess.model.Scene.SceneType1;
import byui.cit260.ultimateChess.model.Scene;
import java.awt.Point;
import ultimatechess.UltimateChess;

/**
 *
 * @author manman
 */
public class MapControl {

    public static Map createMap() {
       //create the map
       Map map = new Map(21,8);
       
       //create a list of the different scenes in the game
       Scene[] scenes = createScenes();
       
       // assign the different scenes to locations in the map
       assignScenesToLocations(map, scenes);
       
       return map;
    }


    private static Scene[] createScenes() {
        Game game = UltimateChess.getCurrentGame();
        Scene[] scenes = new Scene[SceneType1.values().length];
        
        //Maze scene
        Scene mazeScene = new Scene();
        mazeScene.setDescription("Welcome to the Maze!");
        mazeScene.setMapSymbol("M");
        mazeScene.setType("Maze");
        scenes[SceneType1.Maze.ordinal()] = mazeScene;
        
        Scene riddleScene = new Scene();
        riddleScene.setDescription("Welcome to the Riddle!");
        riddleScene.setMapSymbol("R");
        riddleScene.setType("Riddle");
        scenes[SceneType1.Riddle.ordinal()] = riddleScene;

        Scene gateScene = new Scene();
        gateScene.setDescription("Welcome to the Gate!");
        gateScene.setMapSymbol("G");
        gateScene.setType("Gate");
        scenes[SceneType1.Gate.ordinal()] = gateScene;

     
        Scene challengeScene = new Scene();
        challengeScene.setDescription("Welcome to the Challenge!");
        challengeScene.setMapSymbol("C");
        challengeScene.setType("Challenge");
        scenes[SceneType1.Challenge.ordinal()] = challengeScene;

        

        Challenge challenge1 = new Challenge();
        challenge1.setDescription("This is your first challenge.");
        challenge1.setMapSymbol("C");
        challenge1.setClue("The magic number is 42.");
        challenge1.setSceneNum(1);
        challenge1.setType("Challenge");
        
        //Get and populate Gameboard
       challenge1.setGameBoard();
        //Get and populate moves
        challenge1.getMoves().add(new Move("White Pawn", new Point (1,3)));
        challenge1.getMoves().add(new Move("White Knight", new Point (2,4)));
        
        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
      Location[][] location = map.getLocations();
      
      location[0][0].setScene(scenes[SceneType1.Maze.ordinal()]);
      location[0][1].setScene(scenes[SceneType1.Maze.ordinal()]);
      location[0][2].setScene(scenes[SceneType1.Maze.ordinal()]);
      location[0][3].setScene(scenes[SceneType1.Maze.ordinal()]);
      location[0][4].setScene(scenes[SceneType1.Maze.ordinal()]);
      location[0][5].setScene(scenes[SceneType1.Maze.ordinal()]);
      location[0][6].setScene(scenes[SceneType1.Maze.ordinal()]);
      location[0][7].setScene(scenes[SceneType1.Maze.ordinal()]);
      location[0][8].setScene(scenes[SceneType1.Maze.ordinal()]);
      
     


  }

    static void moveActorsToStartingLocation(Map map) {
      
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