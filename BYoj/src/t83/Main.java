package t83;
import java.util.*;
public class Main{
	public static void main(String[] args) {
		int[] output = new int[100000];
		int k=0;
		Scanner scanner = new Scanner(System.in);
		int n;
		while(scanner.hasNext()){
			n = scanner.nextInt();
			int[] array = new int[n];
			for(int i = 0;i< n;i++){
				array[i] = scanner.nextInt();
			}
//			output[k] =singleNumber(array);
		   System.out.println(singleNumber(array));
			k++;
		}
		scanner.close();
//	    for (int i = 0; i < k ; i++) {
//			System.out.println(output[i]);
//			
//		}

	}
	private static int singleNumber(int[] A){  
        int res = 0;  
        int n = A.length;
//        System.out.println(n);
        for(int i=0; i<n; i++){  
        	int count = 0;
        	res = A[i];
            for(int j=0; j<n; j++){              	
                if (res == A[j]) {
                	count++;
//                	System.out.println(count);
				}
            }  
            if (count == 1) {
				return res;
			} 
        }
        return res;
   }
}