package homework;
import  java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("請輸入你想一個數字判斷是否為完美數->");
		int x=keyin.nextInt();
		int y=1;
		int z=0;
		while(y<x) {
			if (x%y==0) {
				z=y+z;
			}
			y++;}
		
	
	if (z==x) {
		System.out.print(x+"是完美數");}
	else {
		System.out.print(x+"不是完美數");}
	}

}
