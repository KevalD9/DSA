package array;

import java.util.Scanner;

public class MissingElement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array:");
		int sizeArr = sc.nextInt();
		
		int arr[] = new int[sizeArr-1];
		
		System.out.println("Enter the elements of array:");
		for(int i=0; i<sizeArr-1; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Missing Element Is: ");
		int j=0;
		for(int i=1; i<sizeArr; i++){
			if(i == arr[j]){
				j++;
			}else{
				System.out.println(i);
			}
		}

		sc.close();
	}
}
