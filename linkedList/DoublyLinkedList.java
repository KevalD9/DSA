/*
Advantages over singly linked list 
1) A DLL can be traversed in both forward and 
    backward direction. 
2) The delete operation in DLL is more efficient 
    if pointer to the node to be deleted is given. 
3) We can quickly insert a new node before a given node. 
    In singly linked list, to delete a node, 
    pointer to the previous node is needed. 
    To get this previous node, sometimes the list is traversed. 
    In DLL, we can get the previous node using previous pointer. 

Disadvantages over singly linked list 
1) Every node of DLL Require extra space for an 
    previous pointer. It is possible to implement 
    DLL with single pointer though. 
2) All operations require an extra pointer previous 
    to be maintained. For example, in insertion, 
    we need to modify previous pointers together with 
    next pointers. For example in following functions 
    for insertions at different positions, 
    we need 1 or 2 extra steps to set previous pointer.
*/

package linkedList;

public class DoublyLinkedList {

    Node head;

    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            prev = null;
            next = null;
        }
    }

    private void newNodeAtFront(int data){

        Node toAdd = new Node(data);

        toAdd.prev = null;
        toAdd.next = head;

        if(head != null){
            head.prev = toAdd;
        }
        head = toAdd;
    }

    boolean isEmpty(){
        return head == null;
    }

    // This and AtEnd Function does the same work.
    // private void createNewNode(int data){
    //     Node toAdd = new Node(data);

    //     if(isEmpty()){
    //         head = toAdd;
    //         return;
    //     }

    //     Node temp = head;
    //     while(temp.next != null){
    //         temp = temp.next;
    //     }
    //     temp.next = toAdd;
    //     toAdd.next = null;
    //     toAdd.prev = temp;
    // }

    private void insertAfter(Node prev_node, int data) {
        Node toAdd = new Node(data);

        if(prev_node == null){
            System.out.println("The Given Prev Node Cannot Be NULL");
            return;
        }
        toAdd.next = prev_node.next;
        prev_node.next =toAdd; 
        toAdd.prev = prev_node;

        if (toAdd.next != null)
            toAdd.next.prev = toAdd;
    }

    private void insertBefore(Node next_node, int data){
        Node toAdd = new Node(data);

        if(next_node == null){
            System.out.println("The Given Next Node Cannot Be NULL");
            return;
        }

        toAdd.prev = next_node.prev;
        next_node.prev = toAdd;
        toAdd.next = next_node;

        if (toAdd.prev != null)
            toAdd.prev.next = toAdd;
    }

    private void newNodeAtEnd(int data){

        Node toAdd = new Node(data);
        if(isEmpty()){
            head = toAdd;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
        toAdd.next = null;
        toAdd.prev = temp;
    }

    private void printDLL(){
        Node last = null;
        Node temp = head;

        System.out.println("Traversal In Forward Direction: ");
        while(temp != null){
            System.out.print(temp.data + " ");
            last = temp;
            temp = temp.next;
        }
        System.out.println();

        System.out.println("Traversal In Reverse Direction: ");
        while(last != null){
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    private void deleteNode(Node del){

        if(head == null || del == null){
            return;
        }

        if(head == del) head = head.next;

        if(del.next != null) del.next.prev = del.prev;

        if(del.prev != null) del.prev.next = del.next;

        return;
    }

    private void lengthDLL(){
        Node temp = head;
        int cnt = 0;

        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        System.out.println("\n" + "Size Of Doubly Linked List Is: " + cnt);
    }

    private void deleteNodeAtGivenPos(int index){
        Node temp = head;
        
        if(temp == null || index <= 0){
            return;
        }

        for(int i=1; temp != null && i<index; i++){
            temp = temp.next;
        }

        if(temp == null) return;

        deleteNode(temp);
    }

    public static void main(String[] args) {
        
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.newNodeAtEnd(6);

        dll.newNodeAtFront(7);
        dll.newNodeAtFront(1);

        dll.newNodeAtEnd(4);

        dll.insertAfter(dll.head.next, 8);

        dll.insertBefore(dll.head.next, 6);

        dll.printDLL();
        System.out.println();

        dll.lengthDLL();
        
        System.out.println("\n");
        System.out.println("After Deleting Node:");
        dll.deleteNode(dll.head.next);
        dll.printDLL();

        System.out.println("\n");
        System.out.println("After Deleting Node At Given Position");
        dll.deleteNodeAtGivenPos(3);
        dll.printDLL();

    }    
}
