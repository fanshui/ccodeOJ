package t94;

import java.util.Scanner;

public class Main {
	static String start;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		int T = Integer.parseInt(string);

		while (T != 0) {
			start = in.nextLine();
			string = in.nextLine();
			int N = Integer.parseInt(string);
			for(int i =0;i<N;i++){
			    parseStr(in.nextLine(),start);
				
			}
			T--;
		}
		in.close();
	}
	
	private static void parseStr(String string, String start1) {
		String[] str = string.split(" ");
		if ("INSERT".equals(str[0])) {

			start = start1+str[1];

			
		}
		if ("QUERY".equals(str[0])) {

			int pos = Integer.parseInt(str[1]);
			char[] tmp = start.toCharArray();
			char tmpC = tmp[pos];
			int min = tmp.length+1;
			for (int i = 0; i < tmp.length; i++) {
				char c = tmp[i];
				if (c == tmpC && i != pos ) {
					if (pos -i >0 && (pos-i) <min) {
						min = pos-i;
					}
					if (pos -i < 0 && (i-pos) < min) {
						min = i- pos;
					}
				}
			}
			
			if (min != tmp.length+1) {
				System.out.println(min); 
			}
			else {
				System.out.println(-1); 
			}
		}
		
	}
	
}
