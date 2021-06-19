package array;

import java.util.Scanner;

public class UnionAndIntersection {

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
		
		System.out.println("Enter the size of second array:");
		int ssArr = sc.nextInt();
		
		int arr1[] = new int[ssArr];
		
		System.out.println("Enter the elements of array:");
		for(int i=0; i<ssArr; i++){
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Union Of Array Is: ");
		findUnion(arr, arr1);
		
		System.out.println("\n"+"Intersection Of Array Is: ");
		findIntersection(arr, arr1);

		sc.close();
			
	}
	
	private static void findUnion(int[] arr, int[] arr1){
		int i=0,j=0;
		while (i < arr.length && j < arr1.length) {
            if (arr[i] < arr1[j]) {
                System.out.print(arr[i] + " ");
                i++;
            } else if (arr1[j] < arr[i]) {
                System.out.print(arr1[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
		
		while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

        while (j < arr1.length) {
            System.out.print(arr1[j] + " ");
            j++;
        }
	}

	private static void findIntersection(int[] arr, int[] arr1) {
		int i = 0;
        int j = 0;

        while (i < arr.length && j < arr1.length) {
            if (arr[i] < arr1[j]) { i++; } 
            else if (arr[i] > arr1[j]) { j++;} 
            else {
                System.out.print(arr[i] + " ");
                i++;
                j++;
            }
        }
	}

}
