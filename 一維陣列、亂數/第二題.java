package homework;
import java.util.Scanner;
public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]=new int [50];
		int sum=0;
		
		for(int i=0;i<50;i++) {
			number[i] = (int) ((Math.random()*100)+1);
			sum=sum+number[i];
			System.out.print(number[i]+" ");
		}

		int x = 0;  
        for(int i=0; i < 50; i++){  
                for(int j=1; j < (50-i); j++){  
                         if(number[j-1] >number[j]){  
                                x = number[j-1];  
                                number[j-1] = number[j];  
                                number[j] = x;  
                        }  
                         
                }  
        } 
        System.out.println();
        System.out.println("�̤j��: "+ number[49]);	
        System.out.println("�̤p��: "+ number[0]);
        System.out.println("�`�M: "+ sum);
        System.out.println();
        number[49]=0;
        number[0]=0;
		
        System.out.println("�s���}�C ");
        for(int i=0;i<50;i++) {
			sum=sum+number[i];
			System.out.print(number[i]+" ");
		}
		System.out.println();
        System.out.println("�̤j��: "+ number[48]);	
        System.out.println("�̤p��: "+ number[1]);
        System.out.println("�`�M: "+ sum);
	}

}
