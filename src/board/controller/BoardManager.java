package board.controller;

import board.model.vo.Board;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Date;
import java.util.ArrayList;

import java.util.Scanner;

public class BoardManager {
    ArrayList<Board> list = new ArrayList<Board>();
    Scanner sc = new Scanner(System.in);

    //디폴트 생성자 board_list.dat 파일의 내용을 읽어서
    //			list에 저장함
    //			null 될 때까지 저장함

    public BoardManager() {
        this.list = list;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("board_list.dat"))) {
            while (true)
                list.add((Board) objectInputStream.readObject());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("종료");
        }

    }




//	1. 게시글 쓰기 메소드
//    public void writeBoard(){}
//		>> 구현내용
//		1> "새 게시글 쓰기 입니다." 출력
//		2> "글제목 : " >> 입력받음(공백포함)
//		3> "작성자 : " >> 이름 입력받음 (공백없이)
//		4> 작성날짜는 현재 날짜로 입력처리함
//		5> "글내용 : " >> 여러 줄로 입력받음
//				"exit" 입력하면 입력종료
//		6> Board 객체 생성시 초기값으로 사용함
//		7> list에 추가함
    public void writeBoard() {
        System.out.print("새 게시물 쓰기 입니다.\n글 제목 :");
        String title = sc.nextLine();
        System.out.print("작성자 :");
        String name = sc.next();
        Date today = new Date(System.currentTimeMillis());
        System.out.println("테스트용 현재시간" + today.toString());

        System.out.print("글 내용 : ");
        String tmp = null;
        StringBuilder stringBuilder = new StringBuilder();
        while(!(tmp = sc.nextLine()).equals("exit")){
            stringBuilder.append(tmp).append("\n");
        }
        list.add(new Board(title,name,today,stringBuilder));
        System.out.println(list.get(0));


    }





}
