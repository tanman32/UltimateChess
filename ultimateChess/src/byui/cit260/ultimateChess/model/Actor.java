/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.awt.Point;
import java.io.Serializable;
/**
 *
 * @author Taylor
 */
public enum Actor implements Serializable {
    
   Tanner("Tanman has red hair"),
    Taylor("Taylor has dark hair");

    private final String description;
    private final Point coordinates;

    Actor(String description) {
    this.description = description;
    coordinates = new Point(1,1);
}   

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    
}
