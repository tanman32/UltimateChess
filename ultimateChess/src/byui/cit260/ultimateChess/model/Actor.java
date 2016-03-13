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

//Make sure to include this class
public enum Actor implements Serializable {
    
   Hero("Hero is you and you need to struggle through this game until you win "
           + "Oh mean you need to beat this game like a boss!"),
    Princess("She can't wait all day, so hurry up and save her or she will"
            + " have to break out of her holding cell on her own");

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
