package board.model.vo;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
    private int boardNo;
    private String boardtitle;
    private String boardWriter;
    private Date boardDate;
    private String boardContent;
    private int readCount;

    public Board(String title, String name, java.sql.Date today, StringBuilder stringBuilder) {
        this.boardtitle = title;
        this.boardWriter = name;
        this.boardDate = today;
        this.boardContent = stringBuilder.toString();
        this.readCount = 0;
    }



    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public String getBoardtitle() {
        return boardtitle;
    }

    public void setBoardtitle(String boardtitle) {
        this.boardtitle = boardtitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public Date getBoardDate() {
        return boardDate;
    }

    public void setBoardDate(Date boardDate) {
        this.boardDate = boardDate;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardNo=" + boardNo +
                ", boardtitle='" + boardtitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardDate=" + boardDate +
                ", boardContent='" + boardContent + '\'' +
                ", readCount=" + readCount +
                '}';
    }

    public void setBoardTitle(String nextLine) {
    }
}
