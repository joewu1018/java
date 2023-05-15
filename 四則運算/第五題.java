
public class homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = 10/2;
		System.out.println(f1);
		//結果為5.0
		
		float f2 = 10/3;
		System.out.println(f2);
		//結果為3.0
		
		float f3 = (float)10/3.0;
		System.out.print(f3);
		//因為3.0是double型別，所以無法跟float做計算。
		
		float f4 = (float)(10/3.0);
		System.out.println(f4);
		//結果為3.3333333
		
		float f5 = 10/3.0F;
		System.out.println(f5);
		//結果為3.3333333
		
	}

}
