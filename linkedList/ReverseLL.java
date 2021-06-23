package linkedList;

public class ReverseLL {
    
    public static void main(String[] args) {
        
        MyLinkedList<Integer> ll = new MyLinkedList<>();

        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
    
        ll.printList();
        System.out.println();

        System.out.println("Reversed All List:");
        ll.reversedList();
        System.out.println();

        System.out.println("Reversed List IN Group Of:");
        ll.reversedGroupList(2);
    }    
}
