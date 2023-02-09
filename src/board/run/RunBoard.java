package board.run;

import board.controller.BoardManager;

public class RunBoard {
    public static void main(String[] args) {
        BoardManager boardManager = new BoardManager();
        boardManager.writeBoard();
    }
}
