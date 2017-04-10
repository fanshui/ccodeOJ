package t87;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] output = new int[100];
		int k =0;
		String str = "";
		Scanner in = new Scanner(System.in);
		int cases  = in.nextInt();
		str = in.nextLine();
		while(cases != 0){
			str = in.nextLine();
			//处理
			String[] s = str.split(":");
//			System.out.println(s[0]+"  "+s[1] + "  " + s[2]);
			//变成int 来处理
			int year = Integer.parseInt(s[0]);
			int mon = Integer.parseInt(s[1]);
			int day = Integer.parseInt(s[2]);
//			System.out.println(year+"  "+mon + "  " + day);
			boolean rn = isRN(year);
			
			
//			output[k]=Dayth(mon,day,rn);
			System.out.println(Dayth(mon,day,rn));
			cases --;
			k++;
					
		}
		in.close();
//		for(int i = 0;i<k;i++){
//			System.out.println(output[i]);
//		}

	}
	private static boolean isRN(int year) {
		if(year % 4 ==0 &&year % 100 != 0  ||  year % 400 ==0)
			return true;
		return false;
	}
	private static int Dayth(int month,int days,boolean isRN) {
		int res=0;
		if (month >2) {
		   if (isRN) {
			switch (month) {
			case 3:
				res = 60 + days;
				break;
			case 4:
				res = 91 + days;break;
			case 5:
				res = 121 + days;break;
			case 6:
				res = 152 + days;break;
			case 7:
				res = 182 + days;break;
			case 8:
				res = 213 + days;break;
			case 9:
				res = 244 + days;break;
			case 10:
				res = 274 + days;break;
			case 11:
				res = 305 + days;break;
		    case 12:
		    	res = 335 + days;break;
			default:
				break;
			}
		} else {
			switch (month) {
			case 3:
				res = 59 + days;break;
			case 4:
				res = 90 + days;break;
			case 5:
				res = 120 + days;break;
			case 6:
				res = 151 + days;break;
			case 7:
				res = 181 + days;break;
			case 8:
				res = 212 + days;break;
			case 9:
				res = 243 + days;break;
			case 10:
				res = 273 + days;break;
			case 11:
				res = 304 + days;break;
		    case 12:
		    	res = 334 + days;break;
			default:
				break;
			}
		}
		   return res;
		}
		else if(month == 1){
			return days;
		}else {
			return 31+days;
	}
		
	}
}
