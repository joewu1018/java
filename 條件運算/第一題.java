package homework;
import  java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("請輸入你想知道的「月份」季節->");
		int month = keyin.nextInt();
		if((month>=3)&&(month<=5)) {
			System.out.println(month+"月為春季");
		}else if ((month>=6)&&(month<=8)) {
			System.out.println(month+"月為夏季");
		}else if ((month>=9)&&(month<=11)) {
			System.out.println(month+"月為秋季");
		}else if (month>12){
			System.out.println("無解");
		}else {
			System.out.println(month+"月為冬季");
		}
		
	}

}
