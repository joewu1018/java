package homework;
import  java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.println("請先輸入您的身高和體重，將會為您換算BMI");
		System.out.print("體重(kg)->");
		double  pound= keyin.nextInt();
		System.out.print("身高(cm)->");
		double tell= keyin.nextInt();
		double  BMI=pound*10000/(tell*tell);
		System.out.println("BMI值為->"+BMI);
		if (BMI<18.5) {
			System.out.print("是屬於體重過輕");
		}else if ((BMI>=18.5)&&(BMI<24)) {
			System.out.print("是屬於正常範圍");
		}else if ((BMI>=24)&&(BMI<27)) {
			System.out.print("是屬於體重過重");
		}else if ((BMI>=27)&&(BMI<30)) {
			System.out.print("是屬於輕度肥胖");
		}else if ((BMI>=30)&&(BMI<35)) {
			System.out.print("是屬於中度肥胖");
		}else {
			System.out.print("是屬於重度肥胖");
		}
	}
}
