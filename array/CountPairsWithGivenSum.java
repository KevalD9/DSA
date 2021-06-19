package array;

import java.util.Scanner;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int sizeArr = sc.nextInt();
		
		System.out.println("Enter the number to find sum of pair:");
		int sum = sc.nextInt();
		
		int arr[] = new int[sizeArr];
		
		System.out.println("Enter the elements of array:");
		for(int i=0; i<sizeArr; i++){
			arr[i] = sc.nextInt();
		}
		
		int sumArr = 0, temp=0;
		for(int i=0; i<sizeArr; i++){
			int j = i +1;
			while(j < sizeArr){
				sumArr = arr[i] + arr[j];
				j++;
				if(sumArr == sum) temp+=1;
			}
		}
		
		System.out.println("Total No. Of Pair Whose Sum Is " + sum + " : " + temp);
		
		sc.close();
	}


}
