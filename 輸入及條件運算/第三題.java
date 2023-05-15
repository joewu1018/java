package homework;
import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("請輸入停車小時數為->");
		int hour = keyin.nextInt();
		int a = (hour-1)*15 + 40;
		if (hour<=1)
		System.out.print("停車花費為"+40+"元");
		else
		System.out.print("停車花費為"+ a+"元");
	}

}
