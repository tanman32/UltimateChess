    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.control;
import citbyui.cit260.ultimateChess.exceptions.GateControlException;
/**
 *
 * @author Taylor
 */
public class GateControl {

    public static double calCodeToBreak(double height, double base) {

        if (height < 1 || height > 10000) {
            return -1;
        }

        if (base < 1 || base > 10000) {
            return -2;
        }

        double area = height * base / 2;

        return area;

    }

    public static double gateToOpen(double resistance, double current) 
            throws GateControlException {

        if (resistance < 1 || resistance > 1000) {
            throw new GateControlException("\ninvalid resistance");
        }

        else if (current < 1 || current > 1000) {
            throw new GateControlException("\ninvalid current");
        }
        
        else{
        double voltage = resistance * current;

        return voltage;
        }
    }
}
