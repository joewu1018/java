package homework;
import  java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.println("���|���ؤ���");
		System.out.println("1.����:270��");
		System.out.println("2.�ǥͲ�:200��");
		System.out.println("3.�����M�b��:160��");
		System.out.print("�Х���J�z�n�ʶR������->");
		int type = keyin.nextInt();
		System.out.print("���ۿ�J�z�n������->");
		int number = keyin.nextInt();
		if (type ==1) {
			System.out.println("�A���ʶR����O���B��"+(number*270));
		}else if (type ==2) {
			System.out.println("�A���ʶR����O���B��"+(number*200));
		}else System.out.println("�A���ʶR����O���B��"+(number*160));
	}

}
