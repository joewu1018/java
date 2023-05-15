package homework;
import  java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.println("本院票種分為");
		System.out.println("1.全票:270元");
		System.out.println("2.學生票:200元");
		System.out.println("3.早場和半票:160元");
		System.out.print("請先輸入您要購買的票種->");
		int type = keyin.nextInt();
		System.out.print("接著輸入您要的票數->");
		int number = keyin.nextInt();
		if (type ==1) {
			System.out.println("你所購買的花費金額為"+(number*270));
		}else if (type ==2) {
			System.out.println("你所購買的花費金額為"+(number*200));
		}else System.out.println("你所購買的花費金額為"+(number*160));
	}

}
