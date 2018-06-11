package src.lassic;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abdecde,dafreaowerfd";
		String [] ar=s1.split("d");
		for(int i=0;i<ar.length;i++){
			System.out.println(i+":"+ar[i]);
			
		}
	}

}
