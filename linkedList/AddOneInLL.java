package linkedList;

public class AddOneInLL {
    
    public static void main(String[] args) {
        
        MyLinkedList<Integer> ll = new MyLinkedList<>();

        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);

        ll.printList();
        System.out.println();

        System.out.println("After Adding One To LL, List Is: ");
        //ll.addOne();
    }
}
