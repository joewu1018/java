package homework;
import  java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner (System.in);
		System.out.println("�Х���J�z�������M�魫�A�N�|���z����BMI");
		System.out.print("�魫(kg)->");
		double  pound= keyin.nextInt();
		System.out.print("����(cm)->");
		double tell= keyin.nextInt();
		double  BMI=pound*10000/(tell*tell);
		System.out.println("BMI�Ȭ�->"+BMI);
		if (BMI<18.5) {
			System.out.print("�O�ݩ��魫�L��");
		}else if ((BMI>=18.5)&&(BMI<24)) {
			System.out.print("�O�ݩ󥿱`�d��");
		}else if ((BMI>=24)&&(BMI<27)) {
			System.out.print("�O�ݩ��魫�L��");
		}else if ((BMI>=27)&&(BMI<30)) {
			System.out.print("�O�ݩ󻴫תέD");
		}else if ((BMI>=30)&&(BMI<35)) {
			System.out.print("�O�ݩ󤤫תέD");
		}else {
			System.out.print("�O�ݩ󭫫תέD");
		}
	}
}
