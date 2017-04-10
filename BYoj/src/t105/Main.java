package t105;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//son[x] 节点x的儿子数  father[y]节点y的父节点
		Scanner in = new Scanner(System.in);
		int[] son = new int[1000];
		int[] father = new int[1000];
		float res = 1f;
		for (int i = 0; i < father.length; i++) {
			son[i] = 0;
			father[i] = -1;
		}
		int N = in.nextInt(),M = in.nextInt(),L = in.nextInt();
		while ((M -- ) != 0) {
			int x = in.nextInt();
			int y = in.nextInt();
			son[x] ++;
			father[y] = x;
		}
		while (father[L] != -1) {
			L = father[L];
			res *= son[L];
		}
		System.out.printf("%.6f\n",1 / res);
		in.close();
	}

}
