package homework;
import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.println("兩圓碰撞測試");
		System.out.println("請輸入第一圓心位置V1座標");
		System.out.print("X1=");
		int x1= keyin.nextInt();
		System.out.print("Y1=");
		int y1= keyin.nextInt();
		System.out.println("再輸入第一圓心位置V2座標");
		System.out.print("X2=");
		int x2= keyin.nextInt();
		System.out.print("Y2=");
		int y2= keyin.nextInt();
		int xd=x2-x1;
		int yd=y2-y1;
		int c=xd*xd+yd*yd;
		System.out.println("圓直徑平方為"+100);
		System.out.println("兩圓心距離平方為"+c);
		if (c>5*5)
		System.out.println("夠遠，沒事");
		else 
		System.out.println("碰到了~~");	

	}

}
