package homework;
import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("�п�J�Ө����{�Ƭ�->");
		int mile= keyin.nextInt();
		int a = ((mile-1000)/200)*10 + 80;
		if (mile<=1000)
		System.out.print("������O��"+80+"��");
		else
		System.out.print("������O��"+ a+"��");
	}

}
