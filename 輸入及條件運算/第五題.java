package homework;
import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.println("���I������");
		System.out.println("�п�J�Ĥ@��ߦ�mV1�y��");
		System.out.print("X1=");
		int x1= keyin.nextInt();
		System.out.print("Y1=");
		int y1= keyin.nextInt();
		System.out.println("�A��J�Ĥ@��ߦ�mV2�y��");
		System.out.print("X2=");
		int x2= keyin.nextInt();
		System.out.print("Y2=");
		int y2= keyin.nextInt();
		int xd=x2-x1;
		int yd=y2-y1;
		int c=xd*xd+yd*yd;
		System.out.println("�ꪽ�|���謰"+100);
		System.out.println("���߶Z�����謰"+c);
		if (c>5*5)
		System.out.println("�����A�S��");
		else 
		System.out.println("�I��F~~");	

	}

}
