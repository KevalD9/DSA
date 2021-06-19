package linkedList;

class CreateSinglyLL{
    Node head; // Head Of List

    /* LL Node. This inner class is made 
    static so main() can access it. */
    static class Node{
        int data;
        Node next;

        //Consturctor
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    private void createNewNode(int data){
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
    }

    boolean isEmpty(){
        return head == null;
    }

    private void addNodeAtBegin(int data) {
        Node toAdd = new Node(data);
        toAdd.next = head;
        head = toAdd;
    }

    private void addNodeAtEnd(int data) {
        Node toAdd = new Node(data);

        if(head == null){
            head = new Node(data);
            return;
        }

        toAdd.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        
        last.next = toAdd;
        return;
    }

    private void insertAfter(Node prev_node, int data){
        if(prev_node == null){
            System.out.println("The given previous node cannot be null.");
            return;
        }

        Node toAdd = new Node(data);
        toAdd.next = prev_node.next;
        prev_node.next = toAdd;
    }

    private void length(){
        Node temp = head;
        int n=0;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        System.out.println("\n" + "Size is: " + n);
    }

    private void printList() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private void searchElement(int data){
        Node temp = head;

        if(temp.data == data){
            System.out.println("\n" + data + " Is In The List.");
        }else{
            temp = temp.next;
            System.out.println("\n" + "Element Not Found!");
        }
    }

    private void deleteElement(int data){
        Node temp = head , prev = null;

        if(temp != null && temp.data == data){
            head = temp.next;
            return;
        }

        while(temp != null && temp.data != data){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null) return;

        prev.next = temp.next;

    }

    private void GetNth(int index){
        Node temp = head;
        int cnt = 0;

        while(temp != null){
            if(cnt == index){
                System.out.println("\n" + "Element at index " + index + " is: " + temp.data);
            }
            cnt++;
            temp = temp.next;
        }

        assert(false);
        System.out.println("\n" + "Index Is Out Of Range.");
    }

    private void countEle(int searchEle){
        Node temp = head;
        int cnt = 0;

        while(temp != null){
            if(temp.data == searchEle){
                cnt++;
            }
            temp = temp.next;
        }
        System.out.println("\n" + "Count of " + searchEle + " is: " + cnt);
    }

    private void minAndMax(){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(head != null){
            if(max < head.data){
                max = head.data;
            }
            if (min > head.data){
                min = head.data;
            }
            head = head.next;
        }
        System.out.println("Max Element in LL is: " + max);
        System.out.println("Min Element in LL is: " + min);
    }

    public static void main(String[] args) {
        
        CreateSinglyLL csll = new CreateSinglyLL();

        csll.createNewNode(19);
        csll.createNewNode(39);
        csll.createNewNode(49);
        csll.createNewNode(9);

        csll.addNodeAtBegin(9);
        csll.addNodeAtEnd(99);

        csll.insertAfter(csll.head.next, 42);

        csll.printList();

        csll.length();

        csll.searchElement(9);
        
        csll.deleteElement(42);

        csll.printList();

        csll.GetNth(5);

        csll.countEle(9);

        csll.minAndMax();
        
    }
}