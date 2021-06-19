package array;

import java.util.Scanner;

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array:");
		int sizeArr = sc.nextInt();
		
		int arr[] = new int[sizeArr];
		
		System.out.println("Enter the elements of array:");
		for(int i=0; i<sizeArr; i++){
			arr[i] = sc.nextInt();
		}
		
		int neg=0, zero=0, negEle=0;
		for(int i=0; i<sizeArr; i++){
			if(arr[i] < 0){
				negEle = arr[i];
				neg++;
			}else if(arr[i] == 0){
				zero++;
			}
		}
		
		if(neg > 0){
			NegFill(arr, sizeArr, negEle);
		}else if(zero > 0){
			System.out.println("There Exist A Subarray With Sum 0.");
		}else{
			System.out.println("There Is No Subarray With Sum 0.");
		}
		
		sc.close();
	}

	private static void NegFill(int[] arr, int sizeArr, int negEle) {
		
		int n = Math.abs(negEle);
		int temp = 0;
		for(int i=0; i<sizeArr; i++){
			if(arr[i] < n){
				temp = n - arr[i];
			}
		}
		
		for(int i=0; i<sizeArr; i++){
			if(temp == arr[i]){
				System.out.println("YES");
			}
		}
	}

}
