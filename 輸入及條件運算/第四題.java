package homework;
import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("請輸入該車里程數為->");
		int mile= keyin.nextInt();
		int a = ((mile-1000)/200)*10 + 80;
		if (mile<=1000)
		System.out.print("停車花費為"+80+"元");
		else
		System.out.print("停車花費為"+ a+"元");
	}

}
