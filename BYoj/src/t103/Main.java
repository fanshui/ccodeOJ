package t103;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			//·´×ª in.nextLine
			String str = in.nextLine();
			String[] sArray = str.split(" ");
			Stack<String> strStack = new Stack<String>();
			for (int i = 0; i < sArray.length; i++) {
//				System.err.print(sArray[i] + " ");
				strStack.push(sArray[i]);
			}
			for (int i = 0; i < sArray.length; i++) {
				System.out.print(strStack.pop());
				if (i != sArray.length - 1) {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		in.close();
	}

}
