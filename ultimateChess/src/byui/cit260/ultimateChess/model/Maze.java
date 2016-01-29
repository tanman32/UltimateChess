/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.io.Serializable;

/**
 *
 * @author Tanman
 */
public class Maze implements Serializable{
    
    private double startLocation;
    private double endLocation;
    private double safePath;

    public Maze() {
    }

    
    public double getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(double startLocation) {
        this.startLocation = startLocation;
    }

    public double getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(double endLocation) {
        this.endLocation = endLocation;
    }

    public double getSafePath() {
        return safePath;
    }

    public void setSafePath(double safePath) {
        this.safePath = safePath;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.startLocation) ^ (Double.doubleToLongBits(this.startLocation) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.endLocation) ^ (Double.doubleToLongBits(this.endLocation) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.safePath) ^ (Double.doubleToLongBits(this.safePath) >>> 32));
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
        final Maze other = (Maze) obj;
        if (Double.doubleToLongBits(this.startLocation) != Double.doubleToLongBits(other.startLocation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.endLocation) != Double.doubleToLongBits(other.endLocation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.safePath) != Double.doubleToLongBits(other.safePath)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Maze{" + "startLocation=" + startLocation + ", endLocation=" + endLocation + ", safePath=" + safePath + '}';
    }
    
    
    
}
