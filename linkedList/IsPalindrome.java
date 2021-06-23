package linkedList;

public class IsPalindrome {

    public static void main(String[] args) {
        
        MyLinkedList<Integer> ll = new MyLinkedList<>();

        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(2);
        ll.addNode(1);

        ll.printList();
        System.out.println();

        System.out.println("Linked List Is Palindrome: " + ll.isPalindrome());
    }
    
}
