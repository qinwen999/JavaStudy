package src.classic;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个年份：");
		long year=scan.nextLong();
		if(year%4==0&&year%100!=0||year%400==0) {
		System.out.print(year+"是润年");	
		}else {
			System.out.println(year+"不是闰年");
		}
	}

}
