package src.classic;

import java.util.Scanner;

public class JudgeMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month=scan.nextInt();
		scan.close();
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("��������·����붬��");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��������·����봺��");
		break;
		case 6:
		case 7:
		case 8:
			System.out.println("��������·������ļ�");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println("��������·������＾");
	    break;
	    default:
			System.out.println("��������·�����");	
		}
		
	}

}
