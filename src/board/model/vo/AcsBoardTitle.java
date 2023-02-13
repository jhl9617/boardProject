package board.model.vo;

import board.model.vo.Board;

import java.util.Comparator;

public class AcsBoardTitle implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int result = 0;
        board.model.vo.Board b1= (board.model.vo.Board) o1;
        board.model.vo.Board b2= (Board) o2;
        result = b1.getBoardtitle().compareTo(b2.getBoardtitle());

        return result;

    }
}