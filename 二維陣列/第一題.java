package homework;
import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w , l;
		String map[]= {" ��"," ��"," "};
		Scanner keyin = new Scanner(System.in);
		System.out.println("�w��Ө�߳�ѡA�ШϥΪ̿�J�@�Ӱ��סB�e�פ���p��5�B����j��100");
		while(true) {
			System.out.println("�п�J�Q�n���e��:"); 
			w = keyin.nextInt();
			if(w>=5 && w<=100)
				break;
		}
		while(true) {
			System.out.println("�п�J�Q�n������:"); 
			l = keyin.nextInt();
			if(l>=5 && l<=100)
				break;
		}
		String m[][]=new String[w][l]; 
		int v[][]=new int[w][l]; 
		for(int i=0;i<l;i++) {
			for(int j=0;j<w;j++) {
				m[i][j]=map[0];
				v[i][j]=0;
			}
		}
		int cx=w/2,cy=l/2,x,y,r=0,win=0;
		v[cx][cy]=1;
		m[cx][cy]=" ��";
		pri(m,w,l);
		while(win==0) {
			System.out.print("�п�J�n���ê�����a�� X Y ->");
			x = keyin.nextInt();
			y = keyin.nextInt();
			while(x<0||w<x||y<0||l<y) {
				System.out.println("�п�J���T���ȡA�п�J X Y ->");
				x = keyin.nextInt();
				y = keyin.nextInt();
			}
			while(v[x-1][y-1]!=0) {
				System.out.println("����w�Q��J�A�Цb��J�@�� �п�J X Y ->");
				x = keyin.nextInt();
				y = keyin.nextInt();
				while(x<0||w<x||y<0||l<y) {
					System.out.println("�п�J���T���ȡA�п�J X Y ->");
					x = keyin.nextInt();
					y = keyin.nextInt();
				}
			}
		invalue(v,m,x,y);
		win=cheak(v,cx,cy,win,w,l);
		if(win!=0) {break;}
		while(true) {
			r = (int) ((Math.random()*4)+1);
			if(r==1) {
				if(v[cx][cy+1]==0) {
					v[cx][cy]=0;
					m[cx][cy]=" ��";
					v[cx][cy+1]=1;
					m[cx][cy+1]=" ��";
					System.out.println("���k");
					cy++;
					break;	
				}
			}
			if(r==2) {
				if(v[cx][cy-1]==0) {
					v[cx][cy]=0;
					m[cx][cy]=" ��";
					v[cx][cy-1]=1;
					m[cx][cy-1]=" ��";
					System.out.println("����");
					cy--;
					break;				
				}
			}
			if(r==3) {
				if(v[cx+1][cy]==0) {
					v[cx][cy]=0;
					m[cx][cy]=" ��";
					v[cx+1][cy]=1;
					m[cx+1][cy]=" ��";
					System.out.println("���U");
					cx++;
					break;
					
				}
			}
			if(r==4) {
				if(v[cx-1][cy]==0) {
					v[cx][cy]=0;
					m[cx][cy]=" ��";
					v[cx-1][cy]=1;
					m[cx-1][cy]=" ��";
					System.out.println("���W");
					cx--;
					break;
					
				}
			}
		}
		win=cheak(v,cx,cy,win,w,l);
		pri(m,w,l);
		}
		if(win==1) {
			System.out.println("Ĺ�F");
		}
		if(win==-1) {
			System.out.println("��F");	
		}
		
	}	
	public static int move (int v[][],String m[][],int cx,int cy,int r) {
			while(true) {
				r = (int) ((Math.random()*4)+1);
				if(r==1) {
					if(v[cx][cy+1]==0) {
						v[cx][cy]=0;
						m[cx][cy]=" ��";
						v[cx][cy+1]=1;
						m[cx][cy+1]=" ��";
						System.out.println("���k");
						break;	
					}
				}
				if(r==2) {
					if(v[cx][cy-1]==0) {
						v[cx][cy]=0;
						m[cx][cy]=" ��";
						v[cx][cy-1]=1;
						m[cx][cy-1]=" ��";
						System.out.println("����");
						break;				
					}
				}
				if(r==3) {
					if(v[cx+1][cy]==0) {
						v[cx][cy]=0;
						m[cx][cy]=" ��";
						v[cx+1][cy]=1;
						m[cx+1][cy]=" ��";
						System.out.println("���U");
						break;	
					}
				}
				if(r==4) {
					if(v[cx-1][cy]==0) {
						v[cx][cy]=0;
						m[cx][cy]=" ��";
						v[cx-1][cy]=1;
						m[cx-1][cy]=" ��";
						System.out.println("���W");
						break;
						
					}
					
					
				}	
			}
		return r;
		}
	public static int cheak ( int v[][],int cx,int cy,int win,int w,int l) {
		if(v[cx+1][cy]==1 && v[cx][cy+1]==1 && v[cx-1][cy]==1 && v[cx][cy-1]==1) {
			win=1;
		}
		else if(cx==0||cx==w-1||cy==0||cy==l-1) {
			win=-1;
		}
		return win;
	}
	public static void invalue (int v[][], String m[][],int x,int y) {
		v[x-1][y-1]=1;
		m[x-1][y-1]=" ��";

	}
	public static void pri (String m[][],int w,int l) {
		for(int i=0;i<l;i++) {
			System.out.print( " "+ (i+1) );
		}
		System.out.println("    ��Y");
		for(int i=0;i<l;i++) {
			for(int j=0;j<w;j++) {
				System.out.print(m[i][j]);
			}
			System.out.print(" "+ (i+1) +"\n");
			
		}
		System.out.println("��X");
	}
}


