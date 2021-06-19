package array;

import java.util.Scanner;

public class QuickSortArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array:");
		int sizeArr = sc.nextInt();
		
		int arr[] = new int[sizeArr];
		
		System.out.println("Enter the elements of array:");
		for(int i=0; i<sizeArr; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array Is:");
		for(int a : arr){
			System.out.print(a + " ");
		}

		sc.close();
	}

}
