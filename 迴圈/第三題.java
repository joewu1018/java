package homework;
import  java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.print("叫块稱计耞琌Ч计->");
		int x=keyin.nextInt();
		int y=1;
		int z=0;
		while(y<x) {
			if (x%y==0) {
				z=y+z;
			}
			y++;}
		
	
	if (z==x) {
		System.out.print(x+"琌Ч计");}
	else {
		System.out.print(x+"ぃ琌Ч计");}
	}

}
