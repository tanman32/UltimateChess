/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

/**
 *
 * @author Tanman
 */
class SceneType {

    static Object values() {
        System.out.println("\nI think this should hold the value "
                + "that specifies a certain scene type");
        
        return null;
    }

    static class start {

        static int ordinal() {
        return 1;
        }

        public start() {
        }
    }

    static class finish {

        static int ordinal() {
        return 8;
        }

        public finish() {
        }
    }
    
}
