/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Tanman
 */
public class MazeScene implements Serializable{
    
    private String description;
    private int reward;
    private int mazeNum;

    public MazeScene() {
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

    public int getMazeNum() {
        return mazeNum;
    }

    public void setMazeNum(int mazeNum) {
        this.mazeNum = mazeNum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + this.reward;
        hash = 29 * hash + this.mazeNum;
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
        final MazeScene other = (MazeScene) obj;
        if (this.reward != other.reward) {
            return false;
        }
        if (this.mazeNum != other.mazeNum) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MazeScene{" + "description=" + description + ", reward=" + reward + ", mazeNum=" + mazeNum + '}';
    }
    
    
    
}
