package homework;
import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin= new Scanner(System.in);
		System.out.print("�п�J�Ʀr:");
		int x,y,z=0;
		int n=keyin.nextInt();
		while(n%2==0){
		System.out.print("��J���~�A�п�J�@�ө_��:");
		n=keyin.nextInt();
		}
		for(x=1;x<=(n-1)/2;x++) {
			for(y=1;y<=(n+1)/2-x;y++) {
				System.out.print(" ");
			}
			for(z=1;z<=(2*x-1);z++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		for(x=1;x<=n;x++) {
			System.out.print("*");
		}
		System.out.println("");
		
		for(x=(n-1)/2;x>=1;x--) {
			for(y=1;y<=(n+1)/2-x;y++) {
				System.out.print(" ");
			}
			for(z=(2*x-1);z>=1;z--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}