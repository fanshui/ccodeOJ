package t94t;

import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String string= in.nextLine();
        while (T != 0) {
            StringBuilder sb = new StringBuilder(in.nextLine());
            int N = Integer.parseInt(in.nextLine());
            for(int i =0;i<N;i++){
                parseStr(in.nextLine(),sb);
            } 
            sb.delete(0, sb.length());
            T--;
        }
        in.close();
    }
     
    private static void parseStr(String string,StringBuilder sb) {
        if (string.startsWith("INSERT")) {
            sb.append(string.charAt(7));
            
        }
        if (string.startsWith("QUERY")) {
            int pos =Integer.parseInt(string.substring(6));
            char c = sb.charAt(pos);
            char[] cArray = sb.toString().toCharArray();
            int dis = -1,min = -1,temp = 0;
            for (int i = 0; i < cArray.length; i++) {
                if(cArray[i] == c && i != pos){
                    dis = (pos - i > 0)?(pos - i):(i-pos);
                    temp++;    
                    if (temp== 1) {
                        min = dis;
                    }else{
                        min = min>dis?dis:min;
                    }
                     
                }
            }
            System.out.println(min);;
        }
       
    }
     
}