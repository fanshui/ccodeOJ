package t92;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T != 0) {
			int N = in.nextInt();
			int[] x = new int[N-1];
			int[] y = new int[N-1];
			int[] deg = new int[N];
			int count = 0 ,err=0;
			for (int i = 0; i < N-1; i++) {
				x[i] = in.nextInt();
				y[i] = in.nextInt();
				deg[x[i]] ++;
				deg[y[i]] ++;
			}
				
			for(int t =0; t < N ;t ++){
				for(int j = 0;j< N-1;j ++){
					if ((x[j] == t && deg[t] < deg[y[j]]) || (y[j] == t && deg[t] < deg[x[j]])) {
						err = 1;
						break;
					}
				}
				
				if (err == 0 ) {
					count ++;
				}
				err = 0;
			}
			System.out.println(count);
			
			
			T--;
		}
		in.close();
	}
}
