package t107;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		int tolength = string.length();
		String string2;
		
		while(in.hasNext()){
			int t = in.nextInt();
			while (t >= 0) {
				int op = in.nextInt();
				if (op == 0) {
					int i = in.nextInt(),len = in.nextInt();
//					System.err.println("i= " + i + "len = " + len +" i + len -1="+ (i + len -1));
					String sta = string.substring(0,i);
//					System.err.println("sta  :  "+sta);
					String mid = string.substring(i,i + len);
//					System.err.println("mid   :  " + mid);
					String end = "";
					if (i+len < tolength) {
						end = string.substring(i + len);
					}
					 
//					System.err.println("end  : "+end);
//					System.err.println(sta + "  " + mid + "  " + end);
					mid = new StringBuilder(mid).reverse().toString();
//					System.err.println("mid reverse : " + mid );
					string = sta + mid + end;
					System.out.println(string);
				}
				if (op == 1) {
					int i = in.nextInt(),len = in.nextInt();
					String st = in.next();
					in.nextLine();
//					System.err.println("i= " + i + "len = " + len +" i + len -1="+ (i + len -1));
					String sta = string.substring(0,i);
//					System.err.println("sta  "+sta);
					String mid = string.substring(i,i + len);
//					System.err.println("mid " + mid);
					String end = "";
					if (i+len < tolength) {
						end = string.substring(i + len);
					}
					 
					mid = st;
					string = sta + mid + end;
					System.out.println(string);
				}
				t --;
			}
		}

	}
	
	//·´×ª
//	private static String reverse(String s,int st,int end) {
//		return s.substring(0,st - 1) + new StringBuilder(s.substring(st, end)).reverse().toString() + s.substring(end+1, s.length() - 1);
//	}
//	
//	//Ìæ»»
//	private static String replace(String s,int start,int end,String string) {
//		return new StringBuilder(s).replace(start, end, string).toString();
//				
//	}
}
