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
public class Gate implements Serializable {
    
    // class instance variable
    private String description;
    private String codeToBreak;
    private double solution;
    private boolean openStatus;
    private int gateNum;

    public Gate() {
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getGateNum() {
        return gateNum;
    }

    public void setGateNum(int gateNum) {
        this.gateNum = gateNum;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + Objects.hashCode(this.codeToBreak);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.solution) ^ (Double.doubleToLongBits(this.solution) >>> 32));
        hash = 43 * hash + (this.openStatus ? 1 : 0);
        hash = 43 * hash + this.gateNum;
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
        if (this.gateNum != other.gateNum) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.codeToBreak, other.codeToBreak)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gate{" + "description=" + description + ", codeToBreak=" + codeToBreak + ", solution=" + solution + ", openStatus=" + openStatus + ", gateNum=" + gateNum + '}';
    }
    
    
}
