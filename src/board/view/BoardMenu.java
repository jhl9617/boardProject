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
            System.out.println("******* �Խñ� ���� ���α׷� *******\n" +
                    "\n" +
                    "\t1. �Խñ� ����\t\t//BoardManager�� writeBoard() ����\n" +
                    "\t2. �Խñ� ��ü ����\t\t//\t\tdisplayAllList()\n" +
                    "\t3. �Խñ� �Ѱ� ����\t\t//\t\tdisplayBoard()\n" +
                    "\t4. �Խñ� ���� ����\t\t//\t\tmodifyTitle()\n" +
                    "\t5. �Խñ� ���� ����\t\t//\t\tmodifyContent()\n" +
                    "\t6. �Խñ� ����\t\t//\t\tdeleteBoard()\n" +
                    "\t7. �Խñ� �˻�\t\t//\t\tsearchBoard()\n" +
                    "\t8. ���Ͽ� �����ϱ�\t\t//\t\tsaveListFile()\n" +
                    "\t9. �����ϱ�\t\t// BookMenu �� sortSubMenu() ����\n" +
                    "\t9. ������\t\t//main() ���� ������");

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
                    System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
            }
        }
    }


    public void sortSubMenu() {

        System.out.println("****** �Խñ� ���� �޴� ******\n" +
                "\n" +
                "\t1. �۹�ȣ�� ������������\t//BookManager �� \tsortList(1, false) ����\n" +
                "\t2. �۹�ȣ�� ������������\t//\t\tsortList(1, true) ����\n" +
                "\t3. �ۼ���¥�� ������������\t//\t\tsortList(2, false) ����\t\t\n" +
                "\t4. �ۼ���¥�� ������������\t//\t\tsortList(2, true) ����\n" +
                "\t5. ������� ������������\t//\t\tsortList(3, false) ����\n" +
                "\t6. ������� ������������\t//\t\tsortList(3, true) ����\n" +
                "\t7. ���� �޴��� �̵�\t\t//return ó��");
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
                System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
        }
    }
}
