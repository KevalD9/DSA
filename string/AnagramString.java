package string;

import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String:");
		String inp1 = sc.nextLine();
		System.out.println("Enter Second String:");
		String inp2 = sc.nextLine();
		
		anagramString(inp1, inp2);

		sc.close();
	}

	private static void anagramString(String inp1, String inp2) {
		
		int al[] = new int[256];
		boolean isAnagram = true;
		
		for(char c : inp1.toCharArray()){
			int index = (int) c;
			al[index]++;
		}
		for(char c : inp2.toCharArray()){
			int index = (int) c;
			al[index]--;
		}
		
		for(int i = 0; i < 256; i++){
			if(al[i] != 0){
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram) System.out.println("String Is Anagram");
		else System.out.println("String Is Not Anagram");
		
	}

}
