package linkedList;

public class GetNthNodeFromEnd {
    
    public static void main(String[] args) {
        
        MyLinkedList<Integer> ll = new MyLinkedList<>();

        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);

        ll.printList();
        System.out.println();

        ll.getNthNode(2);
    }
}
