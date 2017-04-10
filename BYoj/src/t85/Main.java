package t85;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		String[] output = new String[10]; 
		int k=0;
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		while(cases != 0){
			int pointNum = in.nextInt();
			Point[] points = new Point[pointNum];
			for (int i = 0; i < points.length; i++) {
				points[i]=new Point(in.nextFloat(), in.nextFloat());	
			}
			output[k]= isAline(points);
			    
			cases --;
			k++;
		}
		for (int i = 0; i < k ; i++) {
			System.out.println(output[i]);
			
		}
		
	}
	private static String isAline(Point[] points) {
		float f = points[1].X * points[2].Y - points[1].X * points[0].Y - points[0].X * points[2].Y;
		float g	= points[2].X * points[1].Y - points[2].X * points[0].Y - points[0].X * points[1].Y;
		if (f - g < 0.000001) {
			return "Yes";
		} 
		return "No";
	}

}
class Point{
	public Point(float x,float y) {
		X = x;
		Y = y;
	}
	float X;
	float Y;
}