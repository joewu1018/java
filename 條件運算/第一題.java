package homework;
import  java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("�п�J�A�Q���D���u����v�u�`->");
		int month = keyin.nextInt();
		if((month>=3)&&(month<=5)) {
			System.out.println(month+"�묰�K�u");
		}else if ((month>=6)&&(month<=8)) {
			System.out.println(month+"�묰�L�u");
		}else if ((month>=9)&&(month<=11)) {
			System.out.println(month+"�묰��u");
		}else if (month>12){
			System.out.println("�L��");
		}else {
			System.out.println(month+"�묰�V�u");
		}
		
	}

}
