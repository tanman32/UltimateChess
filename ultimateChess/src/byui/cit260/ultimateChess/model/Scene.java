/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.io.Serializable;
import ultimatechess.UltimateChess;
//import java.util.*;

/**
 *
 * @author Tanman
 */
public class Scene implements Serializable{
//private instance variables
    private String riddle;
    private String challenge;
    private String gate;
    private String mazeScene;
    
//getter and setter function
    //location
    //default constructor
    
    private void setDescription(String this_is_the_beginning_of_the_program) {
       
    }

    private void setMapSymbol(String _st_) {
     
    }

    private void setBlocked(boolean b) {
      
    }

    private void setTravelTime(double d) {
  
    }
    
    //ArrayList<Student> students = new ArrayList<>();
    public enum SceneType{
        start,
        finish;
    }
    private static Scene[] createScenes() 
    {
        Game game = UltimateChess.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("\nThis is the beginning of the program.");
        startingScene.setBlocked(false);
        startingScene.setMapSymbol(" ST ");
        startingScene.setTravelTime(240.0);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("\nThis is the ending of the program.");
        finishScene.setBlocked(false);
        finishScene.setMapSymbol(" FN ");
        startingScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return null;
    }
}
