package twangyan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(fib(in.nextInt()) % (1000000007));  
	}
	private static int fib(int n) {
		 if (n==1) {
			return 1;
		} else  if(n == 2){
			return 2;
		}else {
			return fib(n - 1) + fib(n-2)+1;
		}
	}

}
