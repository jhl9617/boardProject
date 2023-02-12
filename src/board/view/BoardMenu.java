package board.view;

import board.controller.BoardManager;

import java.util.Scanner;

public class BoardMenu {

    Scanner scanner = new Scanner(System.in);
    BoardManager boardManager = new BoardManager();

    public BoardMenu() {
    }

    public void mainMenu() {

        while (true){
            System.out.println("******* 게시글 서비스 프로그램 *******\n" +
                    "\n" +
                    "\t1. 게시글 쓰기\t\t//BoardManager의 writeBoard() 실행\n" +
                    "\t2. 게시글 전체 보기\t\t//\t\tdisplayAllList()\n" +
                    "\t3. 게시글 한개 보기\t\t//\t\tdisplayBoard()\n" +
                    "\t4. 게시글 제목 수정\t\t//\t\tmodifyTitle()\n" +
                    "\t5. 게시글 내용 수정\t\t//\t\tmodifyContent()\n" +
                    "\t6. 게시글 삭제\t\t//\t\tdeleteBoard()\n" +
                    "\t7. 게시글 검색\t\t//\t\tsearchBoard()\n" +
                    "\t8. 파일에 저장하기\t\t//\t\tsaveListFile()\n" +
                    "\t9. 정렬하기\t\t// BookMenu 의 sortSubMenu() 실행\n" +
                    "\t9. 끝내기\t\t//main() 으로 리턴함");

            int input = scanner.nextInt();
            switch (input){
                case 1: boardManager.writeBoard();break;
                case 2:boardManager.displayAllList();break;
                case 3:boardManager.displayBoard();break;
                case 4: boardManager.modifyTitle();break;
                case 5:boardManager.modifyContent();break;
                case 6:boardManager.deleteBoard();break;
                case 7:boardManager.searchBoard();break;
                case 8:boardManager.saveListFile();break;
                case 9:sortSubMenu(); break;
                case 10:return;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }


    public void sortSubMenu() {

        System.out.println("****** 게시글 정렬 메뉴 ******\n" +
                "\n" +
                "\t1. 글번호순 오름차순정렬\t//BookManager 의 \tsortList(1, false) 실행\n" +
                "\t2. 글번호순 내림차순정렬\t//\t\tsortList(1, true) 실행\n" +
                "\t3. 작성날짜순 오름차순정렬\t//\t\tsortList(2, false) 실행\t\t\n" +
                "\t4. 작성날짜순 내림차순정렬\t//\t\tsortList(2, true) 실행\n" +
                "\t5. 글제목순 오름차순정렬\t//\t\tsortList(3, false) 실행\n" +
                "\t6. 글제목순 내림차순정렬\t//\t\tsortList(3, true) 실행\n" +
                "\t7. 이전 메뉴로 이동\t\t//return 처리");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                boardManager.sortList(1, false);
                break;
            case 2:
                boardManager.sortList(1, true);
                break;
            case 3:
                boardManager.sortList(2, false);
                break;
            case 4:
                boardManager.sortList(2, true);
                break;
            case 5:
                boardManager.sortList(3, false);
                break;
            case 6:
                boardManager.sortList(3, true);
                break;
            case 7:
                return;
            default:
                System.out.println("잘못 입력 하셨습니다.");
        }
    }
}
