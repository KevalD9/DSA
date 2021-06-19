package string;

import java.util.Scanner;

public class DuplicateChar {

	private static void findDuplicateChar(String input) {
		
		char[] inp = input.toCharArray();
		
		System.out.println("Duplicate Character: ");
		for(int  i = 0; i<input.length(); i++){
			for(int j = i + 1; j < input.length(); j++){
				if(inp[i] == inp[j]){
					System.out.println(inp[j]);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		
		findDuplicateChar(input);

		sc.close();
	}

	

}
