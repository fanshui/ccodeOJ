package twangyan;

import java.util.Scanner;  

/** 
 * Fibonacci 
 * 
 * @author tongqian.zhang 
 */  
public class Fibonacci {  
  
    public static void main(String[] args) {  
          
        System.out.println(fibonacci(8) );  
          

    }  
      
    // 递归实现方式  
    public static int fibonacci(int n){  
        
    	if(n <= 2){  
            return 1;  
        }else{  
            return fibonacci(n-1) + fibonacci(n-2);  
        }  
    }  
      
 
}  
