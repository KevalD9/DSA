package string;

public class stringToInt {

	public static void main(String[] args) {
		
		String s = "2015";
		int i = 2021;
		
		stringToIntt(s);
		intToString(i);	
	}

	private static void intToString(int i) {
		
		String s = Integer.toString(i);
		String s1 = String.valueOf(i);
		System.out.println(s + " " + s1);
	}

	private static void stringToIntt(String s) {
		
		int i = Integer.parseInt(s);
		int i1 = Integer.valueOf(s);
		
		System.out.println(i + " " + i1);
	}

}
