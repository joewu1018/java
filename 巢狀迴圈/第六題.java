package homework;
import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin=new Scanner(System.in);
		System.out.print("請輸入一整數->");
		int n =keyin.nextInt();
		int x,y;
		for(x=2;x<=n;x++) {
			int prime=1;
			for(y=2;y<=(x-1);y++) {
				if((x%y)==0) {
					prime=0;
					break;
				}else {
					prime=1;
				}
			}
			if(prime==1) {
				System.out.println(x);
			}
		}
	}

}
