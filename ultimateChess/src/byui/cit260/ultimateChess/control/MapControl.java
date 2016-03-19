/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.control;

//import byui.cit260.ultimateChess.model.Actor;
//import byui.cit260.ultimateChess.model.Challenge;
import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Map;
//import byui.cit260.ultimateChess.model.Move;
import byui.cit260.ultimateChess.model.Scene.SceneType1;
import byui.cit260.ultimateChess.model.Scene;
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
        potionScene.setType("Power-up");
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
/*
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
        challenge1.getMoves().add(new Move("White Knight", new Point (2,4)));*/
        
        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
      Location[][] location = map.getLocations();
      
      for (int i = 0; i < 21; i++)
      {
          for (int j = 0; j < 21; j++)
          {
              location[i][j].setScene(scenes[SceneType1.Empty.ordinal()]);
          }
      }
      location[2][1].setScene(scenes[SceneType1.Powerup.ordinal()]);
      location[3][1].setScene(scenes[SceneType1.Riddle.ordinal()]);
      location[4][1].setScene(scenes[SceneType1.Clue.ordinal()]);
      location[6][1].setScene(scenes[SceneType1.Challenge.ordinal()]);
      location[7][1].setScene(scenes[SceneType1.Clue.ordinal()]);
      location[9][1].setScene(scenes[SceneType1.Powerup.ordinal()]);
      location[10][1].setScene(scenes[SceneType1.Riddle.ordinal()]);
      location[11][1].setScene(scenes[SceneType1.Clue.ordinal()]);
      location[13][1].setScene(scenes[SceneType1.Challenge.ordinal()]);
      location[14][1].setScene(scenes[SceneType1.Clue.ordinal()]);
      location[16][1].setScene(scenes[SceneType1.Powerup.ordinal()]);
      location[17][1].setScene(scenes[SceneType1.Riddle.ordinal()]);
      location[18][1].setScene(scenes[SceneType1.Clue.ordinal()]);
      location[3][2].setScene(scenes[SceneType1.Path.ordinal()]);
      location[6][2].setScene(scenes[SceneType1.Path.ordinal()]);
      location[10][2].setScene(scenes[SceneType1.Path.ordinal()]);
      location[13][2].setScene(scenes[SceneType1.Path.ordinal()]);
      location[17][2].setScene(scenes[SceneType1.Path.ordinal()]);
      location[1][3].setScene(scenes[SceneType1.Finish.ordinal()]);
      location[2][3].setScene(scenes[SceneType1.Gate.ordinal()]);
      location[3][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[4][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[5][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[6][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[7][3].setScene(scenes[SceneType1.Gate.ordinal()]);
      location[8][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[9][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[10][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[11][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[12][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[13][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[14][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[15][3].setScene(scenes[SceneType1.Gate.ordinal()]);
      location[16][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[17][3].setScene(scenes[SceneType1.Start.ordinal()]);
      location[18][3].setScene(scenes[SceneType1.Path.ordinal()]);
      location[19][3].setScene(scenes[SceneType1.Challenge.ordinal()]);
      location[3][4].setScene(scenes[SceneType1.Path.ordinal()]);
      location[8][4].setScene(scenes[SceneType1.Path.ordinal()]);
      location[16][4].setScene(scenes[SceneType1.Path.ordinal()]);
      location[19][4].setScene(scenes[SceneType1.Clue.ordinal()]);
      location[2][5].setScene(scenes[SceneType1.Potion.ordinal()]);
      location[3][5].setScene(scenes[SceneType1.Maze.ordinal()]);
      location[4][5].setScene(scenes[SceneType1.Clue.ordinal()]);
      location[7][5].setScene(scenes[SceneType1.Potion.ordinal()]);
      location[8][5].setScene(scenes[SceneType1.Maze.ordinal()]);
      location[9][5].setScene(scenes[SceneType1.Clue.ordinal()]);
      location[15][5].setScene(scenes[SceneType1.Potion.ordinal()]);
      location[16][5].setScene(scenes[SceneType1.Maze.ordinal()]);
      location[17][5].setScene(scenes[SceneType1.Clue.ordinal()]);
      
      


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