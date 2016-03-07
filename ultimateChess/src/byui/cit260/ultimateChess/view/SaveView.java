/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.control.GameControl;
import ultimatechess.UltimateChess;

/**
 *
 * @author manman
 */
public class SaveView extends View {
     private String menu;
    private String promptMessage;
    public SaveView()
    {
        super("\n"
              + "\n---------------------------"
              + "\n| Your Game Saved |"          
              + "\n---------------------------");       
    }

    /**
     *
     * @param Value
     * @return
     */
    @Override
    public boolean doAction(String Value) {
        
    }
     
}