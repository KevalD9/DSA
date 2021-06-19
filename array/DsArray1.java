package array;
import java.util.Scanner;

public class DsArray1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
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
		
		sc.close();
		
//		System.out.println("Enter the find number in array:");
//		int findArr = sc.nextInt();
		
		//8.Sort An Array Of 0s, 1s and 2s Without Sorting Algo.
//		int tempZero=0, tempOne=0, tempTwo=0;
//		for(int i=0; i<sizeArr; i++){
//			if(arr[i] == 0) tempZero+=1;
//			if(arr[i] == 1) tempOne+=1;
//			if(arr[i] == 2) tempTwo+=1;
//		}
//		
//		int cnt = 0;
//		while (tempZero > 0) {
//            arr[cnt++] = 0;
//            tempZero--;
//        }
//		
//		while (tempOne > 0) {
//            arr[cnt++] = 1;
//            tempOne--;
//        }
//		
//		while (tempTwo > 0) {
//            arr[cnt++] = 2;
//            tempTwo--;
//        }
		
		
		//10.Move Negative Number To One-Side
//		int j=0,temp;
//		for(int i=0; i<sizeArr; i++){
//			if(arr[i]<0){
//				if(i != j){
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//				j++;
//			}
//		}
		
		
		//7.No. Of Occurrances In Array
//		int temp=0;
//		for(int i=0; i<sizeArr; i++){
//			if(findArr == arr[i]) temp+=1;
//		}
//		System.out.println("No. of occurrances is: " + temp);
		
		
		//6.Find nth Largest/Smallest Elements In Array
//		System.out.println("\n" + findArr + " Largest Number Is " + arr[sizeArr-findArr]);
//		System.out.println(findArr + " Smallest Number Is " + arr[findArr-1]);
		

		//5.Sorted Array Using Bubble-Sort
//		for(int i=0; i<sizeArr-1; i++){
//			
//			boolean sorted = true;
//			
//			for(int j=0; j<sizeArr-1-i; j++){
//				
//				if(arr[j+1] < arr[j]){
//					int temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = temp;
//					
//					sorted = false;
//				}
//			}
//			if(sorted) break;
//		}
		
		
		//3.Max Element
//		int res = arr[0];
//		for(int i=0; i<sizeArr; i++){
//			res = Math.max(res, arr[i]);
//		}
//		System.out.println("Max element is " + res);
		
		//2.Find Number Present In Array
//		boolean result = true;
//		for(int i=0; i<sizeArr; i++){
//			if(findNum == arr[i]){
//				System.out.println(result);
//			}
//		}
		
	}
}