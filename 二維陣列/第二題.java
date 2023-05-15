package homework;
import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=9, l=9,win=0,x=0,y=0;
		Scanner keyin = new Scanner(System.in);
		String m[][]=new String[w][l]; 
		for(int i=0;i<l;i++) {
			for(int j=0;j<w;j++) {
				m[i][j]=" □";
			}
		}
		System.out.println("welcome");
		System.out.println("遊戲規則：");
		System.out.println("先把四個棋子連成一條線 獲勝");
		System.out.println("玩家先出，當黑子");
		pri(m,w,l);
		while(win==0) {
			do {
				System.out.print("請輸入要放棋子的地方 X Y ->");
				x = keyin.nextInt();
				y = keyin.nextInt();
				while(!m[x-1][y-1].equals(" □")) {
					System.out.println("此格已被填入，請在輸入一次 請輸入 X Y ->");
					x = keyin.nextInt();
					y = keyin.nextInt();	
				}
				if(x<0||w<x||y<0||l<y) {System.out.println("輸入錯誤!");}
			}while(x<0||w<x||y<0||l<y);
			m[x-1][y-1]=" ●";
			pri(m,w,l);
			win=cheak(m,w,l,x,y);
			if(win !=0) {break;}
			pri(m,w,l);
			do {
				x = (int) ((Math.random()*9)+1);
				y = (int) ((Math.random()*9)+1);
			}while(!m[x-1][y-1].equals(" □"));
			m[x-1][y-1]=" ○";
			pri(m,w,l);
			win=cheak(m,w,l,x,y);	
		}
		if(win==1) {
			System.out.println("黑子贏了!你獲勝");
		}
		else if(win==2) {
			System.out.println("白子贏了!電腦獲勝");
		}
	}
	public static int cheak (String m[][],int w,int l,int x,int y) {
		int vw=0,cw=0;
		for(int i=0;i<w;i++) {
			if(m[i][y-1].equals(" ○")){
				cw++;
				if(cw==4) {break;}
			}
			else {cw=0;}
			if(m[i][y-1].equals(" ●")){
				vw++;
				if(vw==4) {break;}
			}
			else {vw=0;}
		}
		int vl=0,cl=0;
		for(int i=0;i<l;i++) {
			if(m[x-1][i].equals(" ○")){
				cl++;
				if(cl==4) {break;}
			}
			else {cl=0;}
			if(m[x-1][i].equals(" ●")){
				vl++;
				if(vl==4) {break;}
			}
			else {vl=0;}
		}
		int rtilt=0, n=0,ctilt=0;
		if(x>y) {n=y-2;}
		else {n=x-2;}
		
		for(int i=x-n-2,j=y-n-2;i<w&&j<l;i++,j++) {
			if(m[i][j].equals(" ○")){
				ctilt++;
				if(ctilt==4) {break;}
			}
			else {ctilt=0;}
			if(m[i][j].equals(" ●")){
				rtilt++;
				if(rtilt==4) {break;}
			}
			else {rtilt=0;}
		}
		
		int ltilt=0,cltilt=0,nx=0,ny=0;

		for(int i=x-1,j=y-1;i>=0&&j<l;i--,j++) {
			nx=i;
			ny=j;		
		}
		for(int i=nx,j=ny;i<w && j>=0;i++,j--) {
			if(m[i][j].equals(" ○")){
				cltilt++;
				if(cltilt==4) {break;}
			}
			else {cltilt=0;}
			if(m[i][j].equals(" ●")){
				rtilt++;
				if(ltilt==4) {break;}
			}
			else {ltilt=0;}
		}
		
		if(vw==4||vl==4||rtilt==4||ltilt==4) {
			return 1;
		}
		else if(cw==4||cl==4||ctilt==4||cltilt==4) {
			return 2;
		}
		else {
			return 0;
		}
	}
	public static void pri (String m[][],int w,int l) {
		System.out.print("  ");
			for(int i=0;i<l;i++) {
				System.out.print( " "+ (i+1) );
			}
			System.out.println("  →Y");
			for(int i=0;i<l;i++) {
				
				System.out.print( (i+1) +" ");
				for(int j=0;j<w;j++) {
					System.out.print(m[i][j]);
				}
				System.out.println();
				
			}
			System.out.println("↓X");
		}

	}

