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
 * @author Tanman
 */
public class Moves implements Serializable{
    
    private String description;
    private int moves;
    private int startLocationOfPieces;
    private int numOfPieces;
    private char typeOfPiece;

    public Moves() {
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public int getStartLocationOfPieces() {
        return startLocationOfPieces;
    }

    public void setStartLocationOfPieces(int startLocationOfPieces) {
        this.startLocationOfPieces = startLocationOfPieces;
    }

    public int getNumOfPieces() {
        return numOfPieces;
    }

    public void setNumOfPieces(int numOfPieces) {
        this.numOfPieces = numOfPieces;
    }

    public char getTypeOfPiece() {
        return typeOfPiece;
    }

    public void setTypeOfPiece(char typeOfPiece) {
        this.typeOfPiece = typeOfPiece;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + this.moves;
        hash = 71 * hash + this.startLocationOfPieces;
        hash = 71 * hash + this.numOfPieces;
        hash = 71 * hash + this.typeOfPiece;
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
        final Moves other = (Moves) obj;
        if (this.moves != other.moves) {
            return false;
        }
        if (this.startLocationOfPieces != other.startLocationOfPieces) {
            return false;
        }
        if (this.numOfPieces != other.numOfPieces) {
            return false;
        }
        if (this.typeOfPiece != other.typeOfPiece) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Moves{" + "description=" + description + ", moves=" + moves + ", startLocationOfPieces=" + startLocationOfPieces + ", numOfPieces=" + numOfPieces + ", typeOfPiece=" + typeOfPiece + '}';
    }
    
    
    
}
