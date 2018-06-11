package src.classic;

import java.util.Scanner;

public class JudgeMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入月份：");
		int month=scan.nextInt();
		scan.close();
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("您输入的月份输入冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("您输入的月份输入春季");
		break;
		case 6:
		case 7:
		case 8:
			System.out.println("您输入的月份输入夏季");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println("您输入的月份输入秋季");
	    break;
	    default:
			System.out.println("您输入的月份有误");	
		}
		
	}

}
