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
public class Gate implements Serializable {
    
    // class instance variable
    private String description;
    private String codeToBreak;
    private double solution;
    private int openStatus;
    private int gateNum;
}
