package homework;
import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("�п�J�����Ƭ�->");
		int chinese = keyin.nextInt();
		Scanner keyin2 = new Scanner (System.in);
		System.out.print("�п�J�ƾǤ��Ƭ�->");
		int math = keyin2.nextInt();
		Scanner keyin3 = new Scanner (System.in);
		System.out.print("�п�J�^����Ƭ�->");
		int english = keyin3.nextInt();
		Scanner keyin4 = new Scanner (System.in);
		System.out.print("�п�J�۵M���Ƭ�->");
		int scinese = keyin4.nextInt();
		double a = (chinese+english+math*2+scinese*2)/6;
		if (a>=60)
		System.out.print("�`��="+a+"�A���ߧA�q�L�o������");
		else 
		System.out.print("�`��="+a+"�A�i���A�S���q�L�o������A�ФU���A���A�F");
		
	}

}
