package homework;
import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		System.out.println("�w��ϥΥ����ھ�");
		int password=00000;
		int n=1;
		while (n<3) {
		System.out.println("�п�J�K�X->");
		int i=keyin.nextInt();
		n++;
		if (i!=password){
			System.out.println("�w��J���~"+n+"���A�ЦA��J�@��!");
			if (n==3) {
				System.out.println("�w��J���~"+n+"���C�Ȱ��A�ȡA�y��A��");
			}
		}
		else{
		System.out.println("�K�X���T�A�w��ϥ�!");
		break;
		}
		
	}

}
}
