package homework;
import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		System.out.println("�w��ϥΥ����ھ�");
		int user,i=0;
		do {
			System.out.println("�����ھ����H�U�A�ȡA�п�J�z�һݭn�ϥΪ��A�ȶ���(���1~4):\n1.�s��\n2.����\n3.��b\n4.�״�");
			user=keyin.nextInt();
			switch(user) {
			case 1:{
				System.out.println("�s�ڦ��\!");
				break;
			}
			case 2:{
				System.out.println("���ڦ��\!");
				break;
			}
			case 3:{
				System.out.println("��ڦ��\!");
				break;
			}
			case 4:{
				System.out.println("�״ڦ��\!");
				break;
			}
			default:
				System.out.println("�п�J1~4�����һݭn���A�ȶ��س�!");
			}
			System.out.println("�аݱz�ݭn�~��ϥΥ����ھ����A�ȶ�?�p�G�ݭn�A�Ы�1�F�p���ݭn�A�Ы������Ʀr");
			i=keyin.nextInt();
		}while(i==1);

	}

}
