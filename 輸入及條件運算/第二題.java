package homework;
import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("請輸入國文分數為->");
		int chinese = keyin.nextInt();
		Scanner keyin2 = new Scanner (System.in);
		System.out.print("請輸入數學分數為->");
		int math = keyin2.nextInt();
		Scanner keyin3 = new Scanner (System.in);
		System.out.print("請輸入英文分數為->");
		int english = keyin3.nextInt();
		Scanner keyin4 = new Scanner (System.in);
		System.out.print("請輸入自然分數為->");
		int scinese = keyin4.nextInt();
		double a = (chinese+english+math*2+scinese*2)/6;
		if (a>=60)
		System.out.print("總分="+a+"，恭喜你通過這次測驗");
		else 
		System.out.print("總分="+a+"，可惜你沒有通過這次測驗，請下次再接再厲");
		
	}

}
