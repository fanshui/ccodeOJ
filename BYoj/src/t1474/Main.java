package t1474;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		String[] output =new String[1000];      //output[]村结果的数组
//		int[][][] output;
		int t=0;
		int cases = in.nextInt();//组数
		int temp = cases;
		int[] wei = new int[cases];
//		output	= new int[cases][][];	
		while (cases != 0) {
			    //读取2个整数 n k
			int n = in.nextInt();
			int k = in.nextInt();
			
			//读n行矩阵
			wei[temp - cases] = n;
           int[][] matrix = new int[n][n];
           int[][] res = new int[n][n];
		        
			for(int i =0 ;i<n;i++)
				for(int j=0;j<n;j++){
					matrix[i][j] = in.nextInt();
				}
			res = matrix;
			
			//计算结果
			for(int i = 1;i<k;i++){
				res = cheng(res,matrix,n);
			}
			//shuchujieguo
			
//			output[t]=res;
			out(res,n);
	       
			cases -- ;

		}
		
		in.close();
//		for(int i = 0; i< temp;i++){
//			out(output[i],wei[i]);
//		}


	}
	
	private static int[][] cheng(int[][] a,int[][] b,int n){
		int[][] re = new int[n][n];
		
		for(int i =0 ;i<n;i++)
			for(int j=0;j<n;j++){
				re[i][j]=0;
				for (int m=0;m<n;m++){
					re[i][j] += a[i][m]*b[m][j]; 
				}
			}
		return re;
	}
	
	private static void out(int[][] a,int n) {
		
		for(int i =0 ;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]);
				if(j!=n-1){
					System.out.print(" ");
				}
			}
			
				System.out.println();
			
		}	
	}

}

