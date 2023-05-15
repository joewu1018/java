package homework;
import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		System.out.println("歡迎使用本提款機");
		int password=00000;
		int n=1;
		while (n<3) {
		System.out.println("請輸入密碼->");
		int i=keyin.nextInt();
		n++;
		if (i!=password){
			System.out.println("已輸入錯誤"+n+"次，請再輸入一次!");
			if (n==3) {
				System.out.println("已輸入錯誤"+n+"次。暫停服務，稍後再用");
			}
		}
		else{
		System.out.println("密碼正確，歡迎使用!");
		break;
		}
		
	}

}
}
