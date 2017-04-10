package t1473;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		 String[] output =new String[1000];      //output[]村结果的数组
		int k = 0;
		int cases = in.nextInt();
		while (cases != 0) {
			    //读取数
//			int unsign_shuzi = (in.nextInt())&0x0FFFF;
			    //变成二进制字符串
			String binarynum = Integer.toBinaryString(in.nextInt());
//			System.err.println(binarynum);
			output[k] = binarynum;
			   //结果数组output
			cases -- ;
			k++;
		}
		
		in.close();
		for(int i = 0; i< k;i++)
			System.out.println(output[i]);
	}

}
