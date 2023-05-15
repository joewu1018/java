package homework;
import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin= new Scanner(System.in);
		System.out.print("請輸入數量:");
		int m=keyin.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print("*");
				}
			System.out.println();
			}
		}
	}

