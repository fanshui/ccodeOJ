package t279;

import java.util.Scanner;

public class Main {
	static int AX,BX,CX,DX,AH,AL,BH,BL,CH,CL,DH,DL= -1;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T != 0) {
			int N = in.nextInt();
			String[] instr = new String[N];
			for(int i = 0;i < N;i ++){
				instr[i] = in.nextLine();
			}
			
			//处理 instr[N]中存的指令
			for(int i = 0;i<N;i++){
				String command =  instr[i].substring(0, 2);
				String OP1 = instr[i].substring(4, 5);
				String OP2 = instr[i].substring(6);
				System.err.println("解析："+ command +"#"+OP1 + "#" + OP2);
				
				//遇到AL AH
				AL = AX & 0x00000000011111111;
				BL = BX & 0x00000000011111111;
				CL = CX & 0x00000000011111111;
				DL = DX & 0x00000000011111111;
				AH = AX >> 8;
			    BH = BX >> 8;
			    CH = CX >> 8;
			    DH = DX >> 8;
			   // 遇到AX
			    //?
			    AX = AH * 256 + AL;
			    
			    parseInstr(command, OP1, OP2);
			    System.out.println(AX + " " + BX + " " + CX + " "+ DX );
			}
			
			
			T -- ;
	    }
		in.close();
	
	}
	
	//解析一行指令 为字符串数组
	private static void parseInstr(String command,String OP1,String OP2) {
		
		int temp;//存OP2的数
		if (OP2.equals("AX")) {
			temp = AX;
		}else
		if (OP2.equals("BX")) {
			temp = BX;
		}else
		if (OP2.equals("CX")) {
			temp = CX;
		}else
		if (OP2.equals("DX")) {
			temp = DX;
		}else
		if (OP2.equals("AH")) {
			
			temp = AH;
		}else
		if (OP2.equals("BH")) {
			temp = BH;
		}else
		if (OP2.equals("CH")) {
			temp = CH;
		}else
		if (OP2.equals("DH")) {
			temp = DH;
		}else
		if (OP2.equals("AL")) {
			temp = AL;
		}else
		if (OP2.equals("BL")) {
			temp = BL;
		}else
		if (OP2.equals("CL")) {
			temp = CL;
		}else
		if (OP2.equals("DL")) {
			temp = DL;
		}else
		if (OP2.endsWith("B")) {
			temp = Integer.parseInt(OP2.substring(7, OP2.length()-2), 2);
		}else
		if (OP2.endsWith("H")) {
			temp = Integer.parseInt(OP2.substring(7, OP2.length()-2), 16);
		}else{
			temp = Integer.parseInt(OP2.substring(7, OP2.length()-1));
		}
		
		
		
		
		if (command.equals("MOV")) {
			//MOV
			if (OP1.equals("AX")) {
				AX = temp;
			}else
			if (OP1.equals("BX")) {
				BX = temp;
			}else
			if (OP1.equals("CX")) {
				CX = temp;
			}else
			if (OP1.equals("DX")) {
				DX = temp;
			}
		}
		
		if (command.equals("ADD")) {
			//ADD
			if (OP1.equals("AX")) {
				AX += temp;
			}else
			if (OP1.equals("BX")) {
				BX += temp;
			}else
			if (OP1.equals("CX")) {
				CX += temp;
			}else
			if (OP1.equals("DX")) {
				DX += temp;
			}
		}
		
	}	
	
}
