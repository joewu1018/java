package homework;
import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("�п�J�����p�ɼƬ�->");
		int hour = keyin.nextInt();
		int a = (hour-1)*15 + 40;
		if (hour<=1)
		System.out.print("������O��"+40+"��");
		else
		System.out.print("������O��"+ a+"��");
	}

}
