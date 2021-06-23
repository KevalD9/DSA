package linkedList;

import java.util.HashMap;
import java.util.Stack;


public class MyLinkedList<E> {
    Node<E> head;

    public void addNode(E data){
        Node<E> toAdd = new Node<E>(data);

        if(isEmpty()){
            head = toAdd;
            return;
        }

        Node<E> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    boolean isEmpty(){
        return head == null;
    }

    public void printList() {
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void length(){
        Node<E> temp = head;
        int n=0;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        System.out.println("\n" + "Size is: " + n);
    }

    static class Node<E>{
        E data;
        Node<E> next;

        //Consturctor
        public Node(E data){
            this.data = data;
            next = null;
        }
    }

    public void getNthNode(int index) {
        Node<E> temp = head;
        int len = 0;
        
        if(isEmpty()) return;

        while(temp != null){
            temp = temp.next;
            len++;
        }

        if(index > len){
            System.out.println(-1);
        }
        
        temp = head;
        for(int i = 1; i < len - index +1; i++){
            temp = temp.next;
        }
        System.out.println(index + " Node From End Of List Is: " + temp.data);

        }

    public boolean isPalindrome() {
        Node<E> temp = head;
        boolean ispalin = true;

        Stack<E> stack = new Stack<>();

        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        while (temp != null) {
 
            E i = stack.pop();
            if (temp.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            temp = temp.next;
        }
        return ispalin;
    }

    public void reversedList() {

        Node<E> temp = head;

        if(isEmpty()) return;

        Stack<E> stack = new Stack<>();

        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){   
            E i = stack.pop(); 
            System.out.print(i + " ");
            temp = temp.next;
        }
        
    }

    public void reversedGroupList(int grpOf){

        Stack<Node<E>> myStack = new Stack<>();
        Node<E> current  = head;
        Node<E> prev = null;

        while(current != null){
            int cnt = 0;
            while(current != null && cnt < grpOf){
                myStack.push(current);
                current = current.next;
                cnt++;
            }
        }

        while(myStack.size() > 0){
            if(prev == null){
                prev = myStack.peek();
                head= prev;
                myStack.pop();
            }
            else{
                prev.next = myStack.peek();
                prev = prev.next;
                myStack.pop();
            }
        }
        prev.next = null;
 
        System.out.println(head);
    }

    public void detectLoop(int pos){

        if(isEmpty()) return;

        Node<E> temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        if(cnt > pos && pos != 0){
            System.out.println("Loop Found.");
            System.out.println("Size Of Loop Is: " + (cnt-pos+1));
        }
        else{
            System.out.println("Loop Not Found.");
            System.out.println("Size Of Loop Is: " + 0);
        }      
    }

    public void RemoveDuplicateFromSortLL() {

        if(isEmpty()) return;

        Node<E> temp = head;

        while(temp != null){
            Node<E> toRemove = temp;
            while(toRemove != null && toRemove.data == temp.data){
                toRemove = toRemove.next;
            }
            temp.next = toRemove;
            temp = temp.next;
        }
    }

    public void RemoveDuplicateFromUnsortLL() {

        HashMap<E , Boolean> track = new HashMap<>();

        Node<E> temp = head;

        while(temp != null){
            if(!track.containsKey(temp.data)){
                System.out.print(temp.data + " ");
            }
            track.put(temp.data, true);
            temp = temp.next;
        }
    }

    public void MoveLastElementToFront() {

        Node<E> last = head, secLast = null;

        if(isEmpty()) return;
        if(head.next == null) return;

        while(last.next != null){
            secLast = last;
            last = last.next;
        }
        secLast.next = null;
        last.next = head;
        head = last;
    }

    public void intersection() {

        // static Node<E> a = null, b = null;
        // static Node<E> dummy = null;
        // static Node<E> tail = null;

        // Node<E> p = a,q = b;
        // while(p != null  &&  q != null)
        // {
        //     if(p.data == q.data)
        //     {
        //         addNode(p.data);
        //         p = p.next;
        //         q = q.next;
        //     }
        //     else if(p.data < q.data)
        //         p = p.next;
        //     else
        //         q= q.next;
        // }
        
    }
}   

//Two-Pointer Algoritham
// Node<E> slow_p = head, fast_p = head;

// int flag = 0;

// while(slow_p != null && fast_p != null 
//     && fast_p.next != null){

//         slow_p = slow_p.next;
//         fast_p = fast_p.next.next;

//         if(slow_p == fast_p){ 
//             flag = 1;
//             break;
//         }
// }
// if(flag == 1) System.out.println("Loop Found");
// else System.out.println("Loop Not Found");