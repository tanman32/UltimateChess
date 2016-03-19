/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.io.Serializable;

/**
 *
 * @author Taylor
 */
public class Game implements Serializable{

    private double gatesUnlocked;
    
    private Map map;
    private Player player; 
    private Actor[] actor;
    private Inventory[] inventory;
        
    public Game() {
    }
    
    public double getGatesUnlocked() {
        return gatesUnlocked;
    }

    public void setGatesUnlocked(double gatesUnlocked) {
        this.gatesUnlocked = gatesUnlocked;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.gatesUnlocked) ^ (Double.doubleToLongBits(this.gatesUnlocked) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "gatesUnlocked=" + gatesUnlocked + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.gatesUnlocked) != Double.doubleToLongBits(other.gatesUnlocked)) {
            return false;
        }
        return true;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }
    
    
}
