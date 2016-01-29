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
public class Riddle implements Serializable{
    private String description;
    private int reward;
    private int riddleNum;

    public Riddle() {
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

    public int getRiddleNum() {
        return riddleNum;
    }

    public void setRiddleNum(int riddleNum) {
        this.riddleNum = riddleNum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + this.reward;
        hash = 67 * hash + this.riddleNum;
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
        final Riddle other = (Riddle) obj;
        if (this.reward != other.reward) {
            return false;
        }
        if (this.riddleNum != other.riddleNum) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Riddle{" + "description=" + description + ", reward=" + reward + ", riddleNum=" + riddleNum + '}';
    }
    
    
    
}
