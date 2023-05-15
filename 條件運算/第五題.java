package homework;
import  java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("請輸入您要判斷是否為閏年的年份->");
		int year = keyin.nextInt();
		if(year%4 ==0) {
			if (year%100==0){
				if(year%400==0) {
					System.out.print(year+"年為閏年");
					}else System.out.print(year+"年為平年");
			}else System.out.print(year+"年為閏年");
		}else System.out.print(year+"年為平年");
	}

}
