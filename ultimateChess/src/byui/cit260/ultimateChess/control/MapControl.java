/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.control;

//import byui.cit260.ultimateChess.model.Actor;
//import byui.cit260.ultimateChess.model.Challenge;
import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Map;
//import byui.cit260.ultimateChess.model.Move;
import byui.cit260.ultimateChess.model.Scene.SceneType1;
import byui.cit260.ultimateChess.model.Scene;
import citbyui.cit260.ultimateChess.exceptions.MapControlException;
import java.awt.Point;
//import java.awt.Point;
import ultimatechess.UltimateChess;

/**
 *
 * @author manman
 */
public class MapControl {

    public static Map createMap() {
       //create the map
       Map map = new Map(21,21);
       
       //create a list of the different scenes in the game
       Scene[] scenes = createScenes();
       
       // assign the different scenes to locations in the map
       assignScenesToLocations(map, scenes);
       
       return map;
    }


    private static Scene[] createScenes() {
        
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
        
        Scene pathScene = new Scene();
        pathScene.setDescription("Keep Walking!");
        pathScene.setMapSymbol("X");
        pathScene.setType("Path");
        scenes[SceneType1.Path.ordinal()] = pathScene;

        Scene startScene = new Scene();
        startScene.setDescription("Welcome to the start of the game!");
        startScene.setMapSymbol("I");
        startScene.setType("Start");
        scenes[SceneType1.Start.ordinal()] = startScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("Congratulations you just saved the princess!");
        finishScene.setMapSymbol("F");
        finishScene.setType("Finish");
        scenes[SceneType1.Finish.ordinal()] = finishScene;
       
        Scene powerUpScene = new Scene();
        powerUpScene.setDescription("Congratulations on recieving a powerup!");
        powerUpScene.setMapSymbol("P");
        powerUpScene.setType("Power-up");
        scenes[SceneType1.Powerup.ordinal()] = powerUpScene;
        
        Scene potionScene = new Scene();
        potionScene.setDescription("Congratulations on recieving a potion!");
        potionScene.setMapSymbol("T");
        potionScene.setType("Potion");
        scenes[SceneType1.Potion.ordinal()] = potionScene;
        
        Scene clueScene = new Scene();
        clueScene.setDescription("Congratulations on recieving a clue!");
        clueScene.setMapSymbol("?");
        clueScene.setType("Clue");
        scenes[SceneType1.Clue.ordinal()] = powerUpScene;
        
        Scene emptyScene = new Scene();
        emptyScene.setDescription("Empty");
        emptyScene.setMapSymbol("*");
        emptyScene.setType("Empty");
        scenes[SceneType1.Empty.ordinal()] = emptyScene;
        
        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
      Location[][] locations = map.getLocations();
      
      for (int i = 0; i < 21; i++)
      {
          for (int j = 0; j < 21; j++)
          {
              locations[i][j].setScene(scenes[SceneType1.Empty.ordinal()]);
          }
      }
      locations[2][1].setScene(scenes[SceneType1.Powerup.ordinal()]);
      locations[3][1].setScene(scenes[SceneType1.Riddle.ordinal()]);
      locations[4][1].setScene(scenes[SceneType1.Clue.ordinal()]);
      locations[6][1].setScene(scenes[SceneType1.Challenge.ordinal()]);
      locations[7][1].setScene(scenes[SceneType1.Clue.ordinal()]);
      locations[9][1].setScene(scenes[SceneType1.Powerup.ordinal()]);
      locations[10][1].setScene(scenes[SceneType1.Riddle.ordinal()]);
      locations[11][1].setScene(scenes[SceneType1.Clue.ordinal()]);
      locations[13][1].setScene(scenes[SceneType1.Challenge.ordinal()]);
      locations[14][1].setScene(scenes[SceneType1.Clue.ordinal()]);
      locations[16][1].setScene(scenes[SceneType1.Powerup.ordinal()]);
      locations[17][1].setScene(scenes[SceneType1.Riddle.ordinal()]);
      locations[18][1].setScene(scenes[SceneType1.Clue.ordinal()]);
      locations[3][2].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[6][2].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[10][2].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[13][2].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[17][2].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[1][3].setScene(scenes[SceneType1.Finish.ordinal()]);
      locations[2][3].setScene(scenes[SceneType1.Gate.ordinal()]);
      locations[3][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[4][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[5][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[6][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[7][3].setScene(scenes[SceneType1.Gate.ordinal()]);
      locations[8][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[9][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[10][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[11][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[12][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[13][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[14][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[15][3].setScene(scenes[SceneType1.Gate.ordinal()]);
      locations[16][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[17][3].setScene(scenes[SceneType1.Start.ordinal()]);
      locations[18][3].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[19][3].setScene(scenes[SceneType1.Challenge.ordinal()]);
      locations[3][4].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[8][4].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[16][4].setScene(scenes[SceneType1.Path.ordinal()]);
      locations[19][4].setScene(scenes[SceneType1.Clue.ordinal()]);
      locations[2][5].setScene(scenes[SceneType1.Potion.ordinal()]);
      locations[3][5].setScene(scenes[SceneType1.Maze.ordinal()]);
      locations[4][5].setScene(scenes[SceneType1.Clue.ordinal()]);
      locations[7][5].setScene(scenes[SceneType1.Potion.ordinal()]);
      locations[8][5].setScene(scenes[SceneType1.Maze.ordinal()]);
      locations[9][5].setScene(scenes[SceneType1.Clue.ordinal()]);
      locations[15][5].setScene(scenes[SceneType1.Potion.ordinal()]);
      locations[16][5].setScene(scenes[SceneType1.Maze.ordinal()]);
      locations[17][5].setScene(scenes[SceneType1.Clue.ordinal()]);
      
      


  }

    public static void moveActorsToStartingLocation(Map map) throws MapControlException {
        // for every actor
        Actor[] actors = Actor.values();
      
        for(Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
            
        }
        
        }
    


    public static void moveActorToLocation(Actor actor, Point coordinates) throws MapControlException {
      
        Map map = UltimateChess.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
            newColumn < 0 || newColumn >= map.getNoOfColumns()) {    
            throw new MapControlException("Can not move actor to location "
                                          + coordinates.x + "," + coordinates.y
                                          +" because that location is outside "
                                          +" the bounds of the map.");
        }
    }

    public static boolean checkLocation(int row, int column) {
     Location[][] locations = UltimateChess.getCurrentGame().getMap().getLocations();
        
        
      for (int i = 0; i < 21; i++)
      {
          System.out.print("\n");
          for (int j = 0; j < 8; j++){
      System.out.print(locations[i][j].getScene().getMapSymbol());
          }
      }
      return true;
    }
}
