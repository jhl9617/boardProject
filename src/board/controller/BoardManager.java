package board.controller;

import board.model.vo.*;
import board.model.vo.AcsBoardNo;
import board.model.vo.AcsBoardTitle;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BoardManager {
    ArrayList<Board> list = new ArrayList<Board>();
    Scanner sc = new Scanner(System.in);

    //����Ʈ ������ board_list.dat ������ ������ �о
    //			list�� ������
    //			null �� ������ ������

    public BoardManager() {
        this.list = list;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("board_list.dat"))) {
            while (true)
                list.add((Board) objectInputStream.readObject());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("����");
        }

    }




    //	1. �Խñ� ���� �޼ҵ�
//    public void writeBoard(){}
//		>> ��������
//		1> "�� �Խñ� ���� �Դϴ�." ���
//		2> "������ : " >> �Է¹���(��������)
//		3> "�ۼ��� : " >> �̸� �Է¹��� (�������)
//		4> �ۼ���¥�� ���� ��¥�� �Է�ó����
//		5> "�۳��� : " >> ���� �ٷ� �Է¹���
//				"exit" �Է��ϸ� �Է�����
//		6> Board ��ü ������ �ʱⰪ���� �����
//		7> list�� �߰���
    public void writeBoard() {
        System.out.print("�� �Խù� ���� �Դϴ�.\n�� ���� :");
        String title = sc.nextLine();
        System.out.print("�ۼ��� :");
        String name = sc.next();
        Date today = new Date();
        System.out.println("�׽�Ʈ�� ����ð�" + today);

        System.out.print("�� ���� : ");
        String tmp = null;
        StringBuilder stringBuilder = new StringBuilder();
        while(!(tmp = sc.nextLine()).equals("exit")){
            stringBuilder.append(tmp).append("\n");
        }
        list.add(new Board(title,name,today,stringBuilder));
        System.out.println(list.get(0));


    }

    public void displayAllList() {
        for (Board board : list) {
            System.out.println(board);
        }
    }
    public void displayBoard() {
        System.out.print("��ȸ �� �� ��ȣ : ");
        int no = sc.nextInt();
        Board b = list.get(no - 1);
        System.out.println(b);
        b.setReadCount(b.getReadCount() + 1);
    }

    public void modifyTitle() {
        try {
            System.out.print("������ �� ��ȣ : ");
            int bNo = sc.nextInt();
            Board board = list.get(bNo);
            System.out.println(board);
            System.out.print("������ ���� : ");
            sc.nextLine();
            board.setBoardtitle(sc.nextLine());
            list.set(bNo, board);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("�ش� ��ȣ�� �����ϴ�.");
        }

    }

    public void modifyContent() {
        try {
            System.out.print("������ �� ��ȣ : ");
            int bNo = sc.nextInt();
            Board b = list.get(bNo);
            System.out.println(b);
            System.out.print("������ ���� : ");


            String tmp = null;
            StringBuilder stringBuilder = new StringBuilder();
            while(!(tmp = sc.nextLine()).equals("exit")){
                stringBuilder.append(tmp).append("\n");
            }


            b.setBoardContent(String.valueOf(stringBuilder));
            list.set(bNo, b);
        } catch (IndexOutOfBoundsException e){
            System.out.println("�ش� �� ��ȣ�� �����ϴ�");
        }

    }

    public void deleteBoard() {
        System.out.print("������ �� ��ȣ : ");
        int bNo = sc.nextInt();
        Board b = list.get(bNo - 1);
        System.out.print("������ �����Ͻðڽ��ϱ�? (y/n) : ");
        if (sc.next().toUpperCase().charAt(0) == 'Y') {
            list.remove(bNo - 1);
            System.out.println(bNo + "�� ���� �����Ǿ����ϴ�.");
        }
    }

    public void searchBoard() {
        System.out.println("�˻��� ���� : ");
        String title = sc.nextLine();

        for (Board board : list) {
            if (board.getBoardtitle().contains(title)) {
                System.out.println(board);
            }
        }

    }

    public void saveListFile() {
        try (ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
            for (int i = 0; i < list.size(); i++) {
                oOut.writeObject(list.get(i));
            }
            oOut.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void sortList(int item, boolean isDesc) {
        if (item == 1) {
            if (isDesc) {
                list.sort(new DescBoardNo());

            }else {
                list.sort(new AcsBoardNo());
            }
        } else if (item == 2) {
            if (isDesc) {
                list.sort(new DescBoardDate());

            } else {
                list.sort(new AcsBoardDate());
            }
        } else if (item == 3) {
            if (isDesc) {
                list.sort(new DescBoardTitle());

            } else {
                list.sort(new AcsBoardTitle());
            }
        }
    }



}
