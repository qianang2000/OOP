package tictactoe;

import cs15.prj.ticTacToeSupport.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class Game implements CS15TicTacToeGame {
    private CS15TicTacToeBoard board;
    private CS15TicTacToeController controller;
    private Players player1;
    private Players player2;
    public Game() {
        this.board = new CS15TicTacToeBoard();
        this.controller = new CS15TicTacToeController();
        this.controller.setControllerMessage("Select a square to start playing!");
        this.player1 = new Players(this, "X");
        this.player2 = new Players(this, "O");
        this.controller.addPlayer(this.player1);
        this.controller.addPlayer(this.player2);
    }
    public CS15TicTacToeBoard getBoard() {
        return this.board;
    }
    public CS15TicTacToeController getController() {
        return this.controller;
    }


    public void invalidSquareChosen(int row, int col) {
        CS15TicTacToeSquare square = this.board.squareAt(row, col);
        square.flashColor(javafx.scene.paint.Color.FIREBRICK);
        this.controller.setControllerMessage("Square chosen has already been taken! Try again!");
    }
    public void noWinner() {
        this.controller.setControllerMessage("It's a tie!");
    }
    public void playerWins() {
        Players player = this.controller.getWinningPlayer();
        this.controller.setControllerMessage("Player "+player.getSymbol()+" has won!");
        this.board.highlightWinningSquares(javafx.scene.paint.Color.LIME);
    }
    public void restartGame() {
        this.board.clearHighlights();
        this.board.clearSymbols();
        this.controller.playAgain();
        this.controller.setControllerMessage("Select a square to start playing!");
    }
}
