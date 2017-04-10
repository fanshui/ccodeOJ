package t93;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T != 0) {
			int N = in.nextInt();
			int[] a = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = in.nextInt();
			}
			boolean b = true;
			for(int j = 0;j<N-1;j++){
				if (a[j] > a[j + 1]) {
					b=false;
					break;
				}
			}
			if(b){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			
			T--;
		}
		in.close();

	}

}
