package stack;

public class MyStack<E> {

    private MyLinkedListStack<E> lls = new MyLinkedListStack<>();
    
    void push(E e){
        lls.add(e);
    }

    E pop() throws Exception{
        if(lls.isEmpty()){
            throw new Exception("Cannot Remove From Empty Stack: Stack Is Empty");
        }
        return lls.removeLast();
    }

    E peek() throws Exception{
        if(lls.isEmpty()){
            throw new Exception("Cannot Get Top Element From Empty Stack: Stack Is Empty");
        }
        return lls.getLast();
    }
}