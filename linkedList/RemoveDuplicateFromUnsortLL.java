package linkedList;

public class RemoveDuplicateFromUnsortLL {
    
    public static void main(String[] args) {
        
        MyLinkedList<Integer> ll = new MyLinkedList<>();

        ll.addNode(2);
        ll.addNode(5);
        ll.addNode(4);
        ll.addNode(5);
        ll.addNode(1);
        ll.addNode(5);

        ll.printList();
        System.out.println();

        System.out.println("After Removing Duplicates From LL Is: ");
        ll.RemoveDuplicateFromUnsortLL();
    }
}
