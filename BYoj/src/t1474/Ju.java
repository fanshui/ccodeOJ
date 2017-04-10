package t1474;

import java.util.Scanner;

public class Ju {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int count = in.nextInt();
            for (int i = 0; i < count; i++) {
                int n = in.nextInt(); // n*n¾ØÕó
                int k = in.nextInt(); // ÃÝ
                if (n > 0 && n <= 10) {
                    int num[][] = new int[n][n];
                    for (int a = 0; a < n; a++) {
                        for (int b = 0; b < n; b++) {
                            num[a][b] = in.nextInt();
                        }
                    }
                    int num1[][] = num;
                    for (int j = 0; j < k - 1; j++) {
                        num1 = juzhen(n, num, num1);
                    }
                    for (int a = 0; a < n; a++) {
                        for (int b = 0; b < n; b++) {
                            System.out.print(num1[a][b] + " ");
                        }
                        if (a < n - 1)
                            System.out.println();
                    }

                }
            }
        }
        in.close();

    }

    public static int[][] juzhen(int n, int num[][], int num1[][]) {
        int num2[][] = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int a = 0; a < n; a++) {
                    // System.out.println(num1[i][a] + " ³Ë " + num[a][j]);
                    sum += num1[i][a] * num[a][j];
                    // System.out.println(sum);
                }
                num2[i][j] = sum;
                sum = 0;
            }
        }
        return num2;
    }

}
