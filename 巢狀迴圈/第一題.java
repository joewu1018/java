package homework;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,time=1;
		for(i=5;i>0;i--) {
			System.out.print("*");
			if(i==1) {
				time++;
				System.out.println();
				if(time==2||time==4) {
					i=4;
					continue;
				}
				if(time==3) {
					i=2;
					continue;
				}
				if(time==5) {
					i=6;
					continue;
				}
			}
		}
	}

}
