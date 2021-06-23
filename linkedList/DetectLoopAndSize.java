package linkedList;

public class DetectLoopAndSize {
    
    public static void main(String[] args) {
        
        MyLinkedList<Integer> ll = new MyLinkedList<>();

        ll.addNode(25);
        ll.addNode(14);
        ll.addNode(19);
        ll.addNode(33);
        ll.addNode(10);
        ll.addNode(21);
        ll.addNode(39);
        ll.addNode(90);
        ll.addNode(58);
        ll.addNode(45);
    
        ll.printList();
        System.out.println();

        ll.detectLoop(4);
        
    }   
}
