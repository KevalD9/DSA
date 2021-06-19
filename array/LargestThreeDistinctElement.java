package array;

import java.util.Scanner;

public class LargestThreeDistinctElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int first, second, third;
		
		System.out.println("Enter The Size Of The Arry:");
		int sizeArr = sc.nextInt();
		
		int arr[] = new int[sizeArr];
		
		System.out.println("Enter The Elements Of The Array:");
		for(int i=0; i<sizeArr ; i++){
			arr[i] = sc.nextInt();
		}
		
		third = first = second = Integer.MIN_VALUE;
        for (int i = 0; i < sizeArr; i++) {
            
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
 
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
 
            else if (arr[i] > third)
                third = arr[i];
        }
 
        System.out.println("Three largest elements are: " + first + " " + second + " " + third + ".");    
	
        sc.close();
    }

}
