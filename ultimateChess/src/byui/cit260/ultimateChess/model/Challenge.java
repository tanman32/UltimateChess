/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.io.Serializable ;
import java.util.Objects;

/**
 *
 * @author Tanman
 */
public class Challenge implements Serializable{
    
    private String description;
    private int challengeNum;
    private int reward;

    public Challenge() {
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getChallengeNum() {
        return challengeNum;
    }

    public void setChallengeNum(int challengeNum) {
        this.challengeNum = challengeNum;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + this.challengeNum;
        hash = 31 * hash + this.reward;
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
        final Challenge other = (Challenge) obj;
        if (this.challengeNum != other.challengeNum) {
            return false;
        }
        if (this.reward != other.reward) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Challenge{" + "description=" + description + ", challengeNum=" + challengeNum + ", reward=" + reward + '}';
    }
    
    
    
}
