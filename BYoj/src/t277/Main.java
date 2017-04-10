package t277;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T != 0) {
			 int n = in.nextInt();
			 int[] a = new int[n];
			 int[] vis = new int[n];
			 for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				vis[i] = 0;
			}
			 
			 int m = in.nextInt();
			 int[] b = new int[m];
			 for (int i = 0; i < m; i++) {
				b[i] = in.nextInt();
			}
			bubbleSort(a);	
			for(int i = 0;i < m; i++){
				int temp=0;
				boolean OK = false;
				for (int j = 0; j < n && OK==false;j++) {
					if (vis[j] == 1) {
						
					}else{
						if (b[i] <= a[j]) {
							temp = a[j];
							vis[j] = 1;
							OK =true;
						}
					}
					
				}
				
				if (!OK) {
					System.out.print("NULL");
				}else {
					System.out.print(temp);
				}
				if (i!=m-1) {
					System.out.print(" ");
				}
			}
			System.out.println(); 
			T -- ;
	    }
		in.close();
	}
	
	private static void bubbleSort(int[] numbers){
		int temp;
		int size = numbers.length;
		for(int i = 0;i < size - 1;i ++){
			for(int j = 0;j < size - 1-i; j ++){
				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j + 1];
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}
	

}
