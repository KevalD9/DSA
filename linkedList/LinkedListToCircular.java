package linkedList;

public class LinkedListToCircular {
    Node head; 

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    private void createNewNode(int data){
        Node toAdd = new Node(data);

        toAdd.data = data;
        toAdd.next = (head);
        (head) = toAdd;
    }

    // boolean isEmpty(){
    //     return head == null;
    // }

    private void circular(){
        Node temp = head;

        while(head.next != null){
            head = head.next;
        }
        head.next = temp;
    }

    private void printList() {
        Node temp = head;
        while(head.next != temp){
            System.out.print(" " + head.data);
            head = head.next;
        }
        System.out.print(" " + head.data);
    }

    public static void main(String[] args) {
        
        LinkedListToCircular ltc = new LinkedListToCircular();

        ltc.createNewNode(1);
        ltc.createNewNode(2);
        ltc.createNewNode(3);
        ltc.createNewNode(4);
        ltc.createNewNode(5);

        ltc.circular();

        ltc.printList();
    }
}
