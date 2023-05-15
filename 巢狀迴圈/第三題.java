package homework;
import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin= new Scanner(System.in);
		System.out.print("請輸入年分:");
		int y=keyin.nextInt();
		System.out.print("請輸入月分:");
		int m=keyin.nextInt();
		if(y%400==0) {
			if(m%2!=0 && m<13 || m==8) {
					System.out.print("31");}
			if(m==2) {
					System.out.print("29");}
			if(m!=2 && m%2==0 && m<13) {
					System.out.print("30");}
			if(m>12) {
					System.out.print("錯誤");}
		}else{
		if(y%4==0) {
			if(y%100!=0) { 
			if(m%2!=0 && m<13 || m==8) {
					System.out.print("31");}
			if(m==2) {
					System.out.print("29");}
			if(m!=2 && m%2==0 && m<13){
					System.out.print("30");}
			if(m>12) {
					System.out.print("錯誤");}
		}
	}
		else{
			if(m%2!=0 && m<13 || m==8) {
					System.out.print("31");}
			if(m==2) {
					System.out.print("28");}
			if(m!=2 && m%2==0 && m<13) {
					System.out.print("30");}
			if(m>12){
					System.out.print("錯誤");}
		}
}}}
