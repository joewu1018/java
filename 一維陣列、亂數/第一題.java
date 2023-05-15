package homework;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer;
		int time=0;
		int total[]=new int[10];
		int l=1;
		for(int a=0;a<10;a++) {
		do {
			int dice1 = (int)(Math.random()*6+1);
			int dice2 = (int)(Math.random()*6+1);
			answer=dice1+dice2;
		}while(answer==4 || answer==5 || answer==6 || answer==8 ||answer==9||answer==10 );
		total[a]=answer;
		if(answer==7||answer==11) {
			time++;
		}
		}
		System.out.println("Ä¹"+time);
		for(int h=0;h<10;h++) {
			System.out.println("²Ä"+l+"³õ"+total[h]);
		}
		
		
	}

}
