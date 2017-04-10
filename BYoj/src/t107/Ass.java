package t107;

public class Ass {
	public static void main(String[] args) {
		String s = "abc";
		String sub = s.substring(0, 0);System.out.println("&"+sub);
		sub = s.substring(0, 1);System.out.println("&"+sub);
		sub = s.substring(0, 2);System.out.println("&"+sub);
		sub = s.substring(0, 3);System.out.println("&"+sub);
	}
}
