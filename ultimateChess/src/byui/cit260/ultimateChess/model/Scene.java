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
    public enum SceneType1 {
        Maze,
        Riddle,
        Gate,
        Challenge,
        Start,
        Finish,
        Path,
        Powerup,
        Potion,
        Clue,
        Empty;
    }
    
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

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.type);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + this.reward;
        hash = 53 * hash + this.sceneNum;
        hash = 53 * hash + Objects.hashCode(this.mapSymbol);
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
    
    
    
}
