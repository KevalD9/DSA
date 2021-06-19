package array;

import java.util.Scanner;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array:");
		int sizeArr = sc.nextInt();
		
		int arr[] = new int[sizeArr];
		
		System.out.println("Enter the elements of array:");
		for(int i=0; i<sizeArr; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The repeating elements are: ");
		for (int i = 0; i < sizeArr; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
            	System.out.print(j + " ");
        }
		sc.close();
	}	

}