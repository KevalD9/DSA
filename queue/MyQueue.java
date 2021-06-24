package queue;

public class MyQueue<E> {

    static class Node<E>{
        E data;
        Node<E> next;

        //Consturctor
        public Node(E data){
            this.data = data;
            next = null;
        }
    }

	public Node<E> head, rear;

	public void enqueue(E e) {

		Node<E> toAdd = new Node<>(e);
		if (head == null) {
			head = rear = toAdd;
			return;
		}

		rear.next = toAdd;
		rear = rear.next;

	}

	public E dequeue() {

		if (head == null) {
			return null;
		}

		Node<E> temp = head;
		head = head.next;

		if (head == null) {
			rear = null;
		}

		return temp.data;
	}

    public E front(){

        if (head == null) {
			return null;
		}

        return head.data;
    }

    public void display(){
        
        if(head == null) {
			return;
		}

        Node<E> temp = head;
        while(temp !=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}