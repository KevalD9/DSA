package string;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String inp = sc.nextLine();
		
		Ispalindrome(inp);

		sc.close();
	}


	private static void Ispalindrome(String inp) {
		
		String rev = "";
		int len = inp.length();
		
		for(int i = len-1; i>=0; i--){
			rev = rev + inp.charAt(i);
		}
		
		if(inp.equals(rev)) System.out.println(inp + " is a Palindrome.");
		else System.out.println(inp + " is not a Palindrome.");
		
	}

}
