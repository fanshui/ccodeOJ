package t276;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cases = in.nextInt();
		while (cases != 0) {
			 int n = in.nextInt();
			 int x = n / 2;
				int y = n / 2 - 1;
			//数组
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			//求中位数输出
			if(n % 2 == 0){
				if (((a[x] + a[y])) % 2 == 0) {
					System.out.println((a[x] + a[y]) / 2);
				} else {
					double re = (double)(a[x] + a[y]) / 2;
					System.out.println(re);
				}
				
				
			}else{
				
				System.out.println(a[(n - 1)/2]);
				
			}
			cases -- ;
		}
		in.close();

	}
}
