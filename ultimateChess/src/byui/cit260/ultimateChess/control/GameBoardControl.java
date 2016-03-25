/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.control;

import byui.cit260.ultimateChess.model.Challenge;
import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Move;
import byui.cit260.ultimateChess.model.Move.GameBoardType1;

/**
 *
 * @author manman
 */
public class GameBoardControl {
    public static Challenge createGameBoard()
    {
        //create gameboard
        Challenge challenge = new Challenge(8,8);
        
        
        //create pieces
        Move[] pieces = createMoves();
        
        
        assignPiecesToChallenge(challenge, pieces);
        
        return challenge;
        
    }
    
    private static Move[] createMoves()
    {
        Move[] pieces = new Move[GameBoardType1.values().length];
        
        //Chess Piece
        Move king = new Move();
        king.setMapSymbol("K");
        king.setPiece("King");
        pieces[GameBoardType1.King.ordinal()] = king;
        
        //Left out a description becuase I didn't see the point.
       Move queen = new Move();
       queen.setMapSymbol("Q");
       queen.setPiece("Queen");
        pieces[GameBoardType1.Queen.ordinal()] = queen;
        
        Move bishop = new Move();
        bishop.setMapSymbol("B");
        bishop.setPiece("Bishop");
        pieces[GameBoardType1.Bishop.ordinal()] = bishop;
        
         Move knight = new Move();
        knight.setMapSymbol("N");
        knight.setPiece("Knight");
        pieces[GameBoardType1.Knight.ordinal()] = knight;
        
         Move castle = new Move();
        castle.setMapSymbol("C");
        king.setPiece("King");
        pieces[GameBoardType1.Castle.ordinal()] = castle;
        
        Move pawn = new Move();
        pawn.setMapSymbol("P");
        pawn.setPiece("Pawn");
        pieces[GameBoardType1.Pawn.ordinal()] = pawn;
       
        
        return pieces;
    }
    
     private static void assignPiecesToChallenge(Challenge challenge, Move[] pieces) {
         Location[][] location = challenge.getLocations();
         
         //Figure this out later on how to assign pieces to your chess board.
     }
}