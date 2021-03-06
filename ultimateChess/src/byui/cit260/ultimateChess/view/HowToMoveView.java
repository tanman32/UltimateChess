/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

/**
 *
 * @author Tanman
 */
public class HowToMoveView extends View{
    
    public HowToMoveView()
     {
         super("\n"
              + "\n---------------------------"
              + "\n| Chess Move Menu         |"
              + "\nP -Pawn"
              + "\nR - Rooke"
              + "\nN - Knight"
              + "\nB - Bishop"
              + "\nZ - Queen"
              + "\nK - King"
              + "\nQ - Quit"
              + "\n---------------------------");
    
     }
   
    @Override
        public boolean doAction(String choice) {
            choice = choice.toUpperCase();
        
        switch (choice){
            case "P":
                this.pawn();
                break;
            case "R":
                this.rooke();
                break;
            case "N":
                this.knight();
                break;
            case "B":
                this.bishop();
                break;
           case "Z":
                this.queen();
                break;
            case "K":
                this.king();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break; 
        }
        
        return false;
    }

    private void pawn() {
        this.console.println("A pawn at the start can move one or two spaces"
                + "\nforward. If an opposing piece is infront, the pawn won't be"
                + "\nable to move forward, unless the opposing piece is "
                + "\ndiagonally aligned with the pawn in which case the pawn has"
                + "\nthe opportunity to take out the enemy piece. If the pawn"
                + "\ncan reach the opposite side of the gameboard it can change"
                + "\ninto a piece that has been taken out of play by your "
                + "\nopponent.");
    }

   private void rooke() {
        this.console.println("A rooke can move an infinite amount of spaces on"
                + "\nthe gameboard vertically or horizontally until it runs into"
                + "\nanother piece.");
    }
     
   private void knight() {
        this.console.println("A knight can jump pieces. A knight can move one"
                + "\nspace vertically or horizontally turn right or left and"
                + "\nthen two more spaces from there or a knight can move two"
                + "\nspace vertically or horizontally turn right or left and"
                + "\ntake one more move from there. A knight kills pieces by "
                + "\nlanding on them.");
    }
   private void bishop() {
        this.console.println("A bishop can move an infinite amount of spaces on"
                + "\nthe gameboard diagonally until it runs into"
                + "\nanother piece.");
    }
   private void queen() {
        this.console.println("A queen can move an infinite amount of spaces on"
                + "\nthe gameboard diagonally, verticall, horizontally"
                + "\nuntil it runs into another piece. She does it all.");
    }
   private void king() {
        this.console.println("The king can only move to a spot that is one "
                + "\nlocation away from him. A king must try his best to not be"
                + "\nin check. Check is where a king's life is threatened by "
                + "\nanother piece. If the king or the pieces can't get the king"
                + "\nout of check, the game over, check-mate!");
    }
}
