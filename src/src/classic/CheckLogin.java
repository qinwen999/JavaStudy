package src.classic;
import java.util.*;
public class CheckLogin {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("�������û�����");
		String username=scan.nextLine();
		System.out.println("���������룺");
		String password=scan.nextLine();
		if(!username.equals("qinwen")){
			System.out.println("�û������������");
			
		}else if(!password.equals("123456")){
			System.out.println("��¼�������");
			
			
		}else {
			System.out.println("��¼�ɹ���");
		}
		
	}
}
