package queue.Deque;

import java.util.ArrayDeque;

public class MainClass {

    public static void main(String[] args) {

		ArrayDeque<Integer> ad = new ArrayDeque<>();

		
		//push method to push the element in the array double ended queue
		ad.push(12);
		ad.push(23);
		ad.push(34);
		
		//pop method to pop the element at the beginning of a array double ended queue

        System.out.println("\nPopped Elemnts Are: ");
		System.out.println(ad.pop());
		System.out.println(ad.pop());

        // System.out.println("\nFirst Element Is : " );
        // ad.peekFirst();

        // System.out.println("\nLast Element Is : " );
        // ad.peekLast();

	}
    
}
