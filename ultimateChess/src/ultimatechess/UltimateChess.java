/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatechess;

import byui.cit260.ultimateChess.model.Player;

/**
 *
 * @author Tanman
 */
public class UltimateChess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
