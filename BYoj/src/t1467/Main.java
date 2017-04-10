package t1467;


import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int value1 = in.nextInt();
		
		BinaryNode binaryNode = new BinaryNode(value1);
		System.out.println(-1);
		cases --;
		while (cases !=0) {
			int value = in.nextInt();
			binaryNode.add(value);
			
//			System.out.println();
			System.out.println(BinaryNode.findfather(null, binaryNode, value));
			
			cases --;
		}
		in.close();
		
	}
	
}
class BinaryNode{
	int value;
	BinaryNode left;
	BinaryNode right;
	public BinaryNode(int value){
		this.value = value;
		this.left =null;
		this.right = null;
	}
	
	public  void add(int value){
		
		if (value > this.value) {
			if (this.right != null) {
				
				this.right.add(value);
			} else {
//				System.out.println(this.value);
				
				this.right = new BinaryNode(value);
			}
		} else {
			if (this.left != null) {
				
				this.left.add(value);
			} else {
//				System.out.println(this.value);
				
				this.left = new BinaryNode(value);
			}
		}
		
	}	
	public  static int findfather(BinaryNode father,BinaryNode bNode,int x) {
		if(x==bNode.value)
		{
			if(father== null) return -1;
			else return father.value;
		}
		
		else if(x>bNode.value)
		{
			return findfather(bNode,bNode.right,x);
		}
		else if(x<bNode.value)
		{
			return findfather(bNode,bNode.left,x);
		}
		return 0;
	}
}
