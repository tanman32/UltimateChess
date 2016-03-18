/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.io.Serializable;
import java.util.Objects;
import ultimatechess.UltimateChess;
//import java.util.*;

/**
 *
 * @author Tanman
 */
public class Scene implements Serializable{
//private instance variables
    private String type;
    
   private String description;
    private int reward;
    private int sceneNum;
    private String mapSymbol;

    public Scene() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getSceneNum() {
        return sceneNum;
    }

    public void setSceneNum(int sceneNum) {
        this.sceneNum = sceneNum;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

//getter and setter function
    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (this.reward != other.reward) {
            return false;
        }
        if (this.sceneNum != other.sceneNum) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "type=" + type + ", description=" + description + ", reward=" + reward + ", sceneNum=" + sceneNum + ", mapSymbol=" + mapSymbol + '}';
    }
    
    
    
//getter and setter function
    
    //location
    //default constructor
    
    /*
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
    }*/
}
