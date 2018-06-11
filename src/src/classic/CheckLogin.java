package src.classic;
import java.util.*;
public class CheckLogin {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username=scan.nextLine();
		System.out.println("请输入密码：");
		String password=scan.nextLine();
		if(!username.equals("qinwen")){
			System.out.println("用户名或密码错误");
			
		}else if(!password.equals("123456")){
			System.out.println("登录密码错误！");
			
			
		}else {
			System.out.println("登录成功！");
		}
		
	}
}
