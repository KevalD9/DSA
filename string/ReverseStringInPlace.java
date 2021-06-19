package string;

import java.util.Scanner;

public class ReverseStringInPlace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String inp = sc.nextLine();
		
		reverseString(inp);

		sc.close();
	}

	private static void reverseString(String inp) {
		
		if(inp == null || inp.isEmpty()){
			System.out.println("Null String");
		}
		
		char[] ch = inp.toCharArray();
		int i=0, j=ch.length - 1;
		
		while(i < j){
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++; j--;
		}
		System.out.println(ch);
		
	}

}
