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
 * @author manman
 */
public class Journal implements Serializable{
    
    private String useDescription;
    private String locationOfclue;
    private String clueDirectory;

    public Journal() {
    }

    
    public String getUseDescription() {
        return useDescription;
    }

    public void setUseDescription(String useDescription) {
        this.useDescription = useDescription;
    }

    public String getLocationOfclue() {
        return locationOfclue;
    }

    public void setLocationOfclue(String locationOfclue) {
        this.locationOfclue = locationOfclue;
    }

    public String getClueDirectory() {
        return clueDirectory;
    }

    public void setClueDirectory(String clueDirectory) {
        this.clueDirectory = clueDirectory;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.useDescription);
        hash = 43 * hash + Objects.hashCode(this.locationOfclue);
        hash = 43 * hash + Objects.hashCode(this.clueDirectory);
        return hash;
    }

    @Override
    public String toString() {
        return "Journal{" + "useDescription=" + useDescription + ", locationOfclue=" + locationOfclue + ", clueDirectory=" + clueDirectory + '}';
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
        final Journal other = (Journal) obj;
        if (!Objects.equals(this.useDescription, other.useDescription)) {
            return false;
        }
        if (!Objects.equals(this.locationOfclue, other.locationOfclue)) {
            return false;
        }
        if (!Objects.equals(this.clueDirectory, other.clueDirectory)) {
            return false;
        }
        return true;
    }
    
    
}
