/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.io.Serializable;
/**
 *
 * @author manman
 */
public class Inventory implements Serializable {
    
    private double potionNum;
    private double powerUpNum;
    private double clueNumCollected;

    public Inventory() {
    }

    
    public double getPotionNum() {
        return potionNum;
    }

    public void setPotionNum(double potionNum) {
        this.potionNum = potionNum;
    }

    public double getPowerUpNum() {
        return powerUpNum;
    }

    public void setPowerUpNum(double powerUpNum) {
        this.powerUpNum = powerUpNum;
    }

    public double getClueNumCollected() {
        return clueNumCollected;
    }

    public void setClueNumCollected(double clueNumCollected) {
        this.clueNumCollected = clueNumCollected;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.potionNum) ^ (Double.doubleToLongBits(this.potionNum) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.powerUpNum) ^ (Double.doubleToLongBits(this.powerUpNum) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.clueNumCollected) ^ (Double.doubleToLongBits(this.clueNumCollected) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "potionNum=" + potionNum + ", powerUpNum=" + powerUpNum + ", clueNumCollected=" + clueNumCollected + '}';
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.potionNum) != Double.doubleToLongBits(other.potionNum)) {
            return false;
        }
        if (Double.doubleToLongBits(this.powerUpNum) != Double.doubleToLongBits(other.powerUpNum)) {
            return false;
        }
        if (Double.doubleToLongBits(this.clueNumCollected) != Double.doubleToLongBits(other.clueNumCollected)) {
            return false;
        }
        return true;
    }

    public void setDescription(String potion) {
       
    }

    public void setQuantityInStock(int i) {
  
    }

    public void setRequiredAmount(int i) {
  
    }
    
    
}
