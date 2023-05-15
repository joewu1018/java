import java.util.Scanner;
import java.util.Random;


public class hw1 {
	public static void main(String[] args) {
		int choose=0;
		do {
		Scanner keyin = new Scanner(System.in);
		System.out.println("歡迎來到猜數字世界");
		System.out.println("請先選擇難度，初級(二位數)輸入1，中級(三位數)輸入2，高級(四位數)輸入3，極限(四位數，十次猜題機會)輸入4");
		int level = keyin.nextInt();
		int A=0;
		int B=0;
		int times=0;
		
		
			switch(level) {
				case 1:
					int code[]=new int [3];
					Random rand = new Random();
					code[0]=11;
					code[1]=rand.nextInt(10);
					code[2]=rand.nextInt(10);
					for(int a =1;a<3;a++) {
						while (code[a-1]==code[a]) {
							code[a]= rand.nextInt(10);
						}
					}
					
					System.out.println(" ");
					System.out.println("請輸入您預測的數字");
					System.out.println("數字不會重複出現喔!");
					System.out.println("請輸入完一個數字後按一次確認鍵");
					int guess[]=new int[3];
					
					while (A!=2){
						for(int a =1;a<3;a++) {
							guess[a] = keyin.nextInt();
						}
						for(int a =1;a<3;a++) {
							for(int b=1;b<3;b++) {
								if(guess[a]==code[b]) {
									B+=1;
							}
								}
									}
						for(int a =1;a<3;a++) {
							if(guess[a]==code[a]) {
								A+=1; 
							}
								}
						B=B-A;
							System.out.println(A+"A"+B+"B");
							if(A==2) {
								System.out.println("遊戲結束!");
							}else {
								A=0;
								B=0;
							}	
					}break;

				case 2:
					int code2[]=new int [4];
					Random rand2 = new Random();
					code2[0]=11;
					code2[1]=rand2.nextInt(10);
					code2[2]=rand2.nextInt(10);
					code2[3]=rand2.nextInt(10);
					for(int a =1;a<4;a++) {
						while (code2[a-1]==code2[a]) {
							code2[a]= rand2.nextInt(10);
						}
					}
					
					System.out.println(" ");
					System.out.println("請輸入您預測的數字");
					System.out.println("數字不會重複出現喔!");
					System.out.println("請輸入完一個數字後按一次確認鍵");
					int guess2[]=new int[4];
					
					while (A!=3){
						for(int a =1;a<4;a++) {
							guess2[a] = keyin.nextInt();
						}
						for(int a =1;a<4;a++) {
							for(int b=1;b<4;b++) {
								if(guess2[a]==code2[b]) {
									B+=1;
							}
								}
									}
						for(int a =1;a<4;a++) {
							if(guess2[a]==code2[a]) {
								A+=1; 
							}
								}
						if(B>A) {
						B=B-A;
						}else {
							B=A-B;
						}
							System.out.println(A+"A"+B+"B");
							if(A==3) {
								System.out.println("遊戲結束!");
							}else {
								A=0;
								B=0;
							}
					}break;
					
				case 3:
					int code3[]=new int [5];
					Random rand3 = new Random();
					code3[0]=11;
					code3[1]=rand3.nextInt(10);
					code3[2]=rand3.nextInt(10);
					code3[3]=rand3.nextInt(10);
					code3[4]=rand3.nextInt(10);
					for(int a =1;a<5;a++) {
						while (code3[a-1]==code3[a]) {
							code3[a]= rand3.nextInt(10);
						}
					}
					
					System.out.println(" ");
					System.out.println("請輸入您預測的數字");
					System.out.println("數字不會重複出現喔!");
					System.out.println("請輸入完一個數字後按一次確認鍵");
					int guess3[]=new int[5];
					
					while (A!=4){
						for(int a =1;a<5;a++) {
							guess3[a] = keyin.nextInt();
						}
						for(int a =1;a<5;a++) {
							for(int b=1;b<5;b++) {
								if(guess3[a]==code3[b]) {
									B+=1;
							}
								}
									}
						for(int a =1;a<5;a++) {
							if(guess3[a]==code3[a]) {
								A+=1; 
							}
								}
						if(B>A) {
						B=B-A;
						}else {
							B=A-B;
						}
							System.out.println(A+"A"+B+"B");
							if(A==4) {
								System.out.println("遊戲結束!");
							}else {
								A=0;
								B=0;
							}
					}		
					break;
					
				case 4:
					int code4[]=new int [5];
					Random rand4 = new Random();
					code4[0]=11;
					code4[1]=rand4.nextInt(10);
					code4[2]=rand4.nextInt(10);
					code4[3]=rand4.nextInt(10);
					code4[4]=rand4.nextInt(10);
					for(int a =1;a<5;a++) {
						while (code4[a-1]==code4[a]) {
							code4[a]= rand4.nextInt(10);
						}
					}
					
					System.out.println(" ");
					System.out.println("請輸入您預測的數字");
					System.out.println("數字不會重複出現喔!");
					System.out.println("請輸入完一個數字後按一次確認鍵");
					int guess4[]=new int[5];
					
					while (A!=4 && times!=11){
						for(int a =1; a<5;a++) {
							guess4[a] = keyin.nextInt();
						}
						times+=1;
						for(int a =1;a<5;a++) {
							for(int b=1;b<5;b++) {
								if(guess4[a]==code4[b]) {
									B+=1;
							}
								}
									}
						for(int a =1;a<5;a++) {
							if(guess4[a]==code4[a]) {
								A+=1; 
							}
								}
						if(B>A) {
						B=B-A;
						}else {
							B=A-B;
						}
							System.out.println(A+"A"+B+"B");
							if(A==4) {
								System.out.println("遊戲結束!");
							}else {
								A=0;
								B=0;
							}
					}		
					break;  	
			}
			System.out.println("您是否要再玩一次呢?1:是，2:否");
			choose=keyin.nextInt();
			}while(choose==1);
		System.out.print("遊戲結束，感謝遊玩");
	}
		
}
					
						
						

		
			
			




