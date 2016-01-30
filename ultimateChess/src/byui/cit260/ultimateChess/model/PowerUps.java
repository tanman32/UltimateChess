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
 * @author manman
 */
public class PowerUps implements Serializable {
    
    private String useDescription;
    private String powerUpAddition;

    public PowerUps() {
    }

    
    public String getUseDescription() {
        return useDescription;
    }

    public void setUseDescription(String useDescription) {
        this.useDescription = useDescription;
    }

    public String getPowerUpAddition() {
        return powerUpAddition;
    }

    public void setPowerUpAddition(String powerUpAddition) {
        this.powerUpAddition = powerUpAddition;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.useDescription);
        hash = 61 * hash + Objects.hashCode(this.powerUpAddition);
        return hash;
    }

    @Override
    public String toString() {
        return "PowerUps{" + "useDescription=" + useDescription + ", powerUpAddition=" + powerUpAddition + '}';
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
        final PowerUps other = (PowerUps) obj;
        if (!Objects.equals(this.useDescription, other.useDescription)) {
            return false;
        }
        if (!Objects.equals(this.powerUpAddition, other.powerUpAddition)) {
            return false;
        }
        return true;
    }
    
    
}
