package homework;
import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("�I���覡�p�U�G10�T�w��= 1���ͮ𳾫����A2�T�w��= 1����ޫ����A�п�J�z�n��J���w���ƶq->");
		int number = keyin.nextInt();
		int a = number/10;
		int b =number%10;
		int c=b/2;
		System.out.print("�I����"+a+"���ͮ𳾩M"+c+"�����");
				
	}

}
