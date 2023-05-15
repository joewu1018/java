package homework;
import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("兌換方式如下：10枚硬幣= 1隻生氣鳥娃娃，2枚硬幣= 1隻綠豬娃娃，請輸入您要投入的硬幣數量->");
		int number = keyin.nextInt();
		int a = number/10;
		int b =number%10;
		int c=b/2;
		System.out.print("兌換到"+a+"隻生氣鳥和"+c+"隻綠豬");
				
	}

}
