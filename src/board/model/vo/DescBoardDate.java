package board.model.vo;

import java.util.Comparator;

public class DescBoardDate implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int result = 0;
        Board b1= (Board) o1;
        Board b2= (Board) o2;
        result = b1.getBoardDate().compareTo(b2.getBoardDate());

        return -result;

    }
}