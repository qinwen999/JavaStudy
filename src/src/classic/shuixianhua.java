package src.classic;

public class shuixianhua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		for(int i=100;i<1000;i++) {
		z=i/100;
		y=i%100/10;
		x=i%10;
		if((x*x*x+y*y*y+z*z*z)==i) {
			System.out.println(i+"是一个水仙花数");
		}
		}
	}

}
