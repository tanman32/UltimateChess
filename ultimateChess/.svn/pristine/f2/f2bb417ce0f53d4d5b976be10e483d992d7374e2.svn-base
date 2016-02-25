/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.control;

/**
 *
 * @author Taylor
 */
public class GateControl {

    public double calCodeToBreak(double height, double base) {

        if (height < 1 || height > 10000) {
            return -1;
        }

        if (base < 1 || base > 10000) {
            return -2;
        }

        double area = height * base / 2;

        return area;

    }

    public double gateToOpen(double resistance, double current) {

        if (resistance < 1 || resistance > 1000) {
            return -3;
        }

        if (current < 1 || current > 1000) {
            return -4;
        }

        double voltage = resistance * current;

        return voltage;

    }
}
