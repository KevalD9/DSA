package queue;

public class MainClass {
    
    public static void main(String[] args) {

		MyQueue<Integer> mq = new MyQueue<>();
		
		// method to add element in queue	
		mq.enqueue(20);
		mq.enqueue(30);
		mq.enqueue(40);
		mq.enqueue(50);
		
        mq.display();
        System.out.println();

        mq.enqueue(60);

        mq.display();
        System.out.println();

		//printing the element removed from the beginning of queue 
		System.out.println("\nElements Removed");
        System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());

        System.out.println("\nAfter Two Node Deletion: ");
        mq.display();

        System.out.println("\nTop element of Queue Is : " + mq.front());
	}
}
