package homework;
import  java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("�п�J�Ӯ��O�̩ұ��ʪ����B->");
		int money = keyin.nextInt();
		if (money<2000) {
			System.out.println("�����馩��95��");
			System.out.print("�馩�᪺���I���B��"+(money*0.95));
		}else if ((money>=2000) && (money<3000)) {
			System.out.println("�����馩��9��");
			System.out.print("�馩�᪺���I���B��"+(money*0.9));
		}else if ((money>=3000) && (money<4000)) {
			System.out.println("�����馩��85��");
			System.out.print("�馩�᪺���I���B��"+(money*0.85));
		}else if ((money>=4000) && (money<5000)) {
			System.out.println("�����馩��8��");
			System.out.print("�馩�᪺���I���B��"+(money*0.8));
		}else {
				System.out.println("�����馩��8��");
				System.out.print("�馩�᪺���I���B��"+(money*0.8));
		}
	}
}
