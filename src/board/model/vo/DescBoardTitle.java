package board.model.vo;


import java.util.Comparator;

public class DescBoardTitle implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int result = 0;
        Board b1= (Board) o1;
        Board b2= (Board) o2;
        result = b1.getBoardtitle().compareTo(b2.getBoardtitle());

        return -result;

    }
}