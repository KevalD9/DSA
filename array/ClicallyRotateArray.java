package array;

import java.util.Scanner;

public class ClicallyRotateArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array:");
		int sizeArr = sc.nextInt();
		
		int arr[] = new int[sizeArr];
		
		System.out.println("Enter the elements of array:");
		for(int i=0; i<sizeArr; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array is:");
		for(int i : arr){
				System.out.print(i + " ");
		}
		
		System.out.println("\n"+"Rotated Array is: ");
		rotateByOne(arr);

		sc.close();
	}

	private static void rotateByOne(int[] arr){
		int a = arr[arr.length-1];
		
		System.out.print(a + " ");
		for(int i=0; i<arr.length-1; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
