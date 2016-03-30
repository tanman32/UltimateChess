/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import byui.cit260.ultimateChess.view.ErrorView;
import java.io.Serializable;
/**
 *
 * @author manman
 */
public class Map implements Serializable{
    
    private int rowCount;
    private int columnCount;
    private Location[][] locations;
    

    public Map(int rowCount, int columnCount) {
        if(rowCount < 1|| columnCount <1) {
            ErrorView.display(this.getClass().getName(),
                    "The number of rows and colums must be > 0");
            return;
        }
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row <rowCount; row++) {
            for(int column = 0; column <columnCount; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                locations[row][column] = location;
            }
        }
    }
    
    
    
    
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }
    private int noOfRows;
    private int noOfColumns;
    
    public Map() {
    }
            
    
   
    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.rowCount;
        hash = 47 * hash + this.columnCount;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    
}
