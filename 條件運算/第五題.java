package homework;
import  java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("�п�J�z�n�P�_�O�_���|�~���~��->");
		int year = keyin.nextInt();
		if(year%4 ==0) {
			if (year%100==0){
				if(year%400==0) {
					System.out.print(year+"�~���|�~");
					}else System.out.print(year+"�~�����~");
			}else System.out.print(year+"�~���|�~");
		}else System.out.print(year+"�~�����~");
	}

}
