package core;

import players.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * This class controls the game by starting it, moving pieces, determining winner
 */
public class Game {
    private Chessboard board;
    private Player playerWhite;
    private Player playerBlack;
    private ArrayList<Move> allMoves;

    private boolean isWhitePlayerTurn=true;
    private boolean enPassant = false;
    public Game(){
        init();
    }

    /**
     * for initializing all objects
     */
    protected final void init(){

    }

     /**
     * Checks if latest move is en Passant and if it is a legal move
     * if no function return false
     * if yes it calls the move functions and returns true
     * @return
     */
    protected boolean enPassant(){
        return false;
    }

    /**
     * makes the lastest move in ArrayList
     */
    public void move(){

    }
    public void newGame(){

    }
    public void endGame(){

    }

    public void moveNetworkAction(){

    }
    public void doComputerMove(){

    }

    /**
     * Switches the current active player
     */
    public void switchActive(){

    }

    public void isCheckMate(){

    }
    public void isStaleMate(){

    }

    public void saveGame() {
        // Create an instance of FileHandler in the constructor or elsewhere in the class
        FileHandler fileHandler = new FileHandler("game1.xml");

        // Get the list of moves representing the game history or the state of the board
        List<Move> moves = null;
        // Get the list of moves representing the game history or the state of the board
        // Call the saveGameToFile method using the fileHandler field
        fileHandler.saveGameToFile(moves);
    }


    // Metoda wczytująca stan gry z pliku
    public void loadGame() {
        FileHandler fileHandler = null;
        List<Move> moves = fileHandler.loadGameFromFile();
        // Przywróć stan gry na podstawie wczytanych ruchów
    }

    public Chessboard getChessboard() {
        return board;
    }


    public void setBoard(Chessboard board) {
        this.board = board;
    }

    public Player getPlayerWhite() {
        return playerWhite;
    }

    public void setPlayerWhite(Player playerWhite) {
        this.playerWhite = playerWhite;
    }

    public Player getPlayerBlack() {
        return playerBlack;
    }

    public void setPlayerBlack(Player playerBlack) {
        this.playerBlack = playerBlack;
    }

    public ArrayList<Move> getAllMoves() {
        return allMoves;
    }

    public void setAllMoves(ArrayList<Move> allMoves) {
        this.allMoves = allMoves;
    }

    public boolean isWhitePlayerTurn() {
        return isWhitePlayerTurn;
    }

    public void setWhitePlayerTurn(boolean whitePlayerTurn) {
        isWhitePlayerTurn = whitePlayerTurn;
    }

    public boolean isEnPassant() {
        return enPassant;
    }

    public void setEnPassant(boolean enPassant) {
        this.enPassant = enPassant;
    }
}
