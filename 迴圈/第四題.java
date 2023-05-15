package homework;
import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		System.out.println("歡迎使用本提款機");
		int user,i=0;
		do {
			System.out.println("本提款機有以下服務，請輸入您所需要使用的服務項目(整數1~4):\n1.存款\n2.提款\n3.轉帳\n4.匯款");
			user=keyin.nextInt();
			switch(user) {
			case 1:{
				System.out.println("存款成功!");
				break;
			}
			case 2:{
				System.out.println("提款成功!");
				break;
			}
			case 3:{
				System.out.println("轉款成功!");
				break;
			}
			case 4:{
				System.out.println("匯款成功!");
				break;
			}
			default:
				System.out.println("請輸入1~4之間所需要的服務項目喔!");
			}
			System.out.println("請問您需要繼續使用本提款機之服務嗎?如果需要，請按1；如不需要，請按任異數字");
			i=keyin.nextInt();
		}while(i==1);

	}

}
