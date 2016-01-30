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
public class Potions implements Serializable{
    
    private String useDescription;
    private String potionChanges;

    public Potions() {
    }

    public String getUseDescription() {
        return useDescription;
    }

    public void setUseDescription(String useDescription) {
        this.useDescription = useDescription;
    }

    public String getPotionChanges() {
        return potionChanges;
    }

    public void setPotionChanges(String potionChanges) {
        this.potionChanges = potionChanges;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.useDescription);
        hash = 47 * hash + Objects.hashCode(this.potionChanges);
        return hash;
    }

    @Override
    public String toString() {
        return "Potions{" + "useDescription=" + useDescription + ", potionChanges=" + potionChanges + '}';
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
        final Potions other = (Potions) obj;
        if (!Objects.equals(this.useDescription, other.useDescription)) {
            return false;
        }
        if (!Objects.equals(this.potionChanges, other.potionChanges)) {
            return false;
        }
        return true;
    }
            
    
}
