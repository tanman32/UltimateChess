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
public class Inventory implements Serializable {
    
    private double potionNum;
    private double powerUpNum;
    private double clueNumCollected;
    private double quantityInStock;
    private String description; 
    
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

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.potionNum) ^ (Double.doubleToLongBits(this.potionNum) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.powerUpNum) ^ (Double.doubleToLongBits(this.powerUpNum) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.clueNumCollected) ^ (Double.doubleToLongBits(this.clueNumCollected) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
        hash = 13 * hash + Objects.hashCode(this.description);
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
        if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "potionNum=" + potionNum + ", powerUpNum=" + powerUpNum + ", clueNumCollected=" + clueNumCollected + ", quantityInStock=" + quantityInStock + ", description=" + description + '}';
    }
    

    

    
    
}
