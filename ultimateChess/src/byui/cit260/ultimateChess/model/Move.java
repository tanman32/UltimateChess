/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.awt.Point;
import java.util.Objects;

/**
 *
 * @author Tanman
 */
public class Move {

    public Move() {
       
    }
    
     public enum GameBoardType1 {
        King,
        Queen,
        Bishop,
        Knight,
        Castle,
        Pawn,
     
    }
        private String piece;
        private Point coordinates;
        private Point moving;
        private String mapSymbol;

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }
       

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.piece);
        hash = 29 * hash + Objects.hashCode(this.coordinates);
        hash = 29 * hash + Objects.hashCode(this.moving);
        hash = 29 * hash + Objects.hashCode(this.mapSymbol);
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
        final Move other = (Move) obj;
        if (!Objects.equals(this.piece, other.piece)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        if (!Objects.equals(this.moving, other.moving)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Move{" + "piece=" + piece + ", coordinates=" + coordinates + ", moving=" + moving + ", mapSymbol=" + mapSymbol + '}';
    }

}
