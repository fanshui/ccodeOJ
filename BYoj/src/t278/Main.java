package t278;

import java.util.Scanner;

public class Main {
	
	static int[][] a ;
	static int[][] visted ;
	static int direc[][] = {{-1,-1},{-1,0},{-1,1},
	         {0,1},{0,-1},
	         {1,-1},{1,0},{1,1}
			};
	static int N;
	static int M;
	static int D;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T != 0) {
			  N = in.nextInt();
			  M = in.nextInt();
			  D = in.nextInt();
			  a = new int[N][M];
			  visted = new int[N][M];
			  
			 for (int i = 0; i < N; i++) {
				for(int j =0;j < M; j++){
					a[i][j] = in.nextInt();
					visted[i][j] = 0;
				}
			}
			 int res = 0;
			 for (int i = 0; i < N; i++) {
					for(int j =0;j < M; j++){
						if (visted[i][j] == 0) {
							res ++;
							visted[i][j] = 1;
							searchP(i, j);
						} 
					}
				}
			System.out.print(res);
			System.out.println();
			T -- ;
	    }
		in.close();
	
	}
	
	private static void searchP(int x,int y) {

		int dx,dy;
		for(int i=0; i<8; i++){  
	        dx=x+direc[i][0];  
	        dy=y+direc[i][1];
	        
	         if (dx >= 0 && dx < N && dy >= 0 && dy < M &&visted[dx][dy] == 0) {
	        	 int d = 0;
	 	        if (a[dx][dy] - a[x][y] > 0) {
	 				d =  a[dx][dy] - a[x][y];
	 			}else{
	 				d = a[x][y] - a[dx][dy];
	 			}	
	 	        if (d <= D) {
	 	        	visted[dx][dy]=1;  
		            searchP(dx, dy);
				}
	 	}  
	    
	}
	}
}


