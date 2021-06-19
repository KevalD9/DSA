package array;

import java.util.Scanner;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array:");
		int sizeArr = sc.nextInt();
		
		int arr[] = new int[sizeArr];
		
		System.out.println("Enter the elements of array:");
		for(int i=0; i<sizeArr; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int a : arr){
			System.out.print(a + " ");
		}
		
		System.out.println("\n" + "Repeating Element Index Is:");
		
		for(int i=0; i < sizeArr; i++){
			for(int j=i+1; j<sizeArr; j++){
				if(arr[i] == arr[j]){
					System.out.print(arr[i] + " ");
				}
			}
		}

		sc.close();
	}
}
