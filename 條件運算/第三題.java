package homework;
import  java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("請輸入該消費者所採購的金額->");
		int money = keyin.nextInt();
		if (money<2000) {
			System.out.println("打的折扣為95折");
			System.out.print("折扣後的應付金額為"+(money*0.95));
		}else if ((money>=2000) && (money<3000)) {
			System.out.println("打的折扣為9折");
			System.out.print("折扣後的應付金額為"+(money*0.9));
		}else if ((money>=3000) && (money<4000)) {
			System.out.println("打的折扣為85折");
			System.out.print("折扣後的應付金額為"+(money*0.85));
		}else if ((money>=4000) && (money<5000)) {
			System.out.println("打的折扣為8折");
			System.out.print("折扣後的應付金額為"+(money*0.8));
		}else {
				System.out.println("打的折扣為8折");
				System.out.print("折扣後的應付金額為"+(money*0.8));
		}
	}
}
