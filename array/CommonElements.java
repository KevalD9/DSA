package array;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array:");
		int sizeArr = sc.nextInt();
		
		int arr[] = new int[sizeArr];
		
		System.out.println("Enter the elements of array:");
		for(int i=0; i<sizeArr; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of Second array:");
		int sizeArr1 = sc.nextInt();
		
		int arr1[] = new int[sizeArr1];
		
		System.out.println("Enter the elements of array:");
		for(int i=0; i<sizeArr1; i++){
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Common Elements are:");
		int i=0,j=0;
		while(i < arr.length && j < arr1.length){
			if( arr[i] == arr1[j] ){
				System.out.print(arr[i] + " ");
				i++; j++;
			}
			else if(arr[i] < arr1[j]) i++;
			else j++;
		}

		sc.close();
	}

}
