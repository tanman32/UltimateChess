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
public class GameBoard implements Serializable{
    
    private int rowNum;
    private int columnNum;

    public GameBoard() {
    }

    
    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getColumnNum() {
        return columnNum;
    }

    public void setColumnNum(int columnNum) {
        this.columnNum = columnNum;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.rowNum;
        hash = 19 * hash + this.columnNum;
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
        final GameBoard other = (GameBoard) obj;
        if (this.rowNum != other.rowNum) {
            return false;
        }
        if (this.columnNum != other.columnNum) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GameBoard{" + "rowNum=" + rowNum + ", columnNum=" + columnNum + '}';
    }
    
    
    
}
