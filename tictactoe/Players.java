package tictactoe;

import cs15.prj.ticTacToeSupport.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class Players implements CS15TicTacToePlayer{
    private Game game;
    private String symbol;
    private CS15TicTacToeBoard board;
    private CS15TicTacToeController controller;
    public Players(Game myGame, String mySymbol) {
        this.game = myGame;
        this.symbol = mySymbol;
        this.board = myGame.getBoard();
        this.controller = myGame.getController();
    }
    public String getSymbol() {
        return this.symbol;
    }
    public void selectSquare(int row, int col) {
        CS15TicTacToeSquare square = this.board.squareAt(row, col);
        if (this.symbol.equals("X")) {
            square.flashColor(javafx.scene.paint.Color.ALICEBLUE);
            square.markSquare("X");
            this.controller.setControllerMessage("Player X finished their turn!");
        }
        else if (this.symbol.equals("O")) {
            square.flashColor(javafx.scene.paint.Color.FUCHSIA);
            square.markSquare("O");
            this.controller.setControllerMessage("Player O finished their turn!");
        }
        this.controller.finishedTurn();
    }
}
