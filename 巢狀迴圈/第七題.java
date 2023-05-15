package homework;
import java.util.Scanner;

public class homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin=new Scanner(System.in);
		System.out.print("請輸入一整數:");
		int n= keyin.nextInt();
		int x, y, z=0;
		
		for(x=1;x<n;x++) {
			for(y=0;y<=x;y++) {
				for(z=1;z<=n-y;z++)
					System.out.print(" ");
				for(z=1;z<=2*y+1;z++)
					System.out.print("*");
				System.out.println();
			}	
		}
		
		for(x=1;x<=n;x++) {
			System.out.print(" ");
		}
		System.out.print("*");
	
	}

}
