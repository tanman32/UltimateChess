/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.ultimateChess.exceptions;

/**
 *
 * @author Tanman
 */

    public class GateControlException extends Exception {

    public GateControlException() {
    }

    public GateControlException(String message) {
        super(message);
    }

    public GateControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public GateControlException(Throwable cause) {
        super(cause);
    }

    public GateControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
