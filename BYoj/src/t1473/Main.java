package t1473;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		 String[] output =new String[1000];      //output[]����������
		int k = 0;
		int cases = in.nextInt();
		while (cases != 0) {
			    //��ȡ��
//			int unsign_shuzi = (in.nextInt())&0x0FFFF;
			    //��ɶ������ַ���
			String binarynum = Integer.toBinaryString(in.nextInt());
//			System.err.println(binarynum);
			output[k] = binarynum;
			   //�������output
			cases -- ;
			k++;
		}
		
		in.close();
		for(int i = 0; i< k;i++)
			System.out.println(output[i]);
	}

}
