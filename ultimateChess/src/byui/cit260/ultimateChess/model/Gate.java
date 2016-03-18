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
public class Gate extends Scene {
    
    // class instance variable
    private String codeToBreak;
    private double solution;
    private boolean openStatus;
  

    public Gate() {
        super();
    }

    public String getCodeToBreak() {
        return codeToBreak;
    }

    public void setCodeToBreak(String codeToBreak) {
        this.codeToBreak = codeToBreak;
    }

    public double getSolution() {
        return solution;
    }

    public void setSolution(double solution) {
        this.solution = solution;
    }

    public boolean isOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(boolean openStatus) {
        this.openStatus = openStatus;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.codeToBreak);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.solution) ^ (Double.doubleToLongBits(this.solution) >>> 32));
        hash = 97 * hash + (this.openStatus ? 1 : 0);
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
        final Gate other = (Gate) obj;
        if (Double.doubleToLongBits(this.solution) != Double.doubleToLongBits(other.solution)) {
            return false;
        }
        if (this.openStatus != other.openStatus) {
            return false;
        }
        if (!Objects.equals(this.codeToBreak, other.codeToBreak)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gate{" + "codeToBreak=" + codeToBreak + ", solution=" + solution + ", openStatus=" + openStatus + '}';
    }

    
   
    
}
