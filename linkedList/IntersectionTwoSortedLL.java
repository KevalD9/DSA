package linkedList;

public class IntersectionTwoSortedLL {

    public static void main(String[] args) {
        
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        MyLinkedList<Integer> ll1 = new MyLinkedList<>();

        System.out.println("Sorted List One: ");
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(6);
        ll.printList();

        System.out.println();
        System.out.println("Sorted List Two: ");
        ll1.addNode(2);
        ll1.addNode(4);
        ll1.addNode(6);
        ll1.addNode(8);
        ll1.printList();

        System.out.println();
        System.out.println("Intersection Of Two Lists Is: ");
        ll.intersection();
    }   
}
