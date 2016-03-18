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
public class Maze extends Scene{
    
    private Location[][] locations = new Location[10][10];
    private Potions potion = new Potions();
    
    public Maze() {
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Potions getPotion() {
        return potion;
    }

    public void setPotion(Potions potion) {
        this.potion = potion;
    }
    
    
    
}
