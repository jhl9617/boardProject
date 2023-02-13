package board.model.vo;

import board.model.vo.Board;

import java.util.Comparator;

public class DescBoardNo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int result = 0;
        board.model.vo.Board b1= (board.model.vo.Board) o1;
        board.model.vo.Board b2= (Board) o2;
        if(b1.getBoardNo() ==(b2.getBoardNo())){
            result = 0;
        } else if (b1.getBoardNo() > (b2.getBoardNo())) {
            result = 1;
        } else {
            result = -1;
        }

        return -result;

    }
}