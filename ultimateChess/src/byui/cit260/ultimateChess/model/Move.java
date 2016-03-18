/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.awt.Point;

/**
 *
 * @author Tanman
 */
public class Move {
    
        private String piece;
        private Point coordinates;

        public Move(String piece, Point coordinates) {
            this.piece = piece;
            this.coordinates = coordinates;
        }

        public String getPiece() {
            return piece;
        }

        public void setPiece(String piece) {
            this.piece = piece;
        }

        public Point getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(Point coordinates) {
            this.coordinates = coordinates;
        }

}
