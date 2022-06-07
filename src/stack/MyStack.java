package stack;

import java.util.LinkedList;
import java.util.Stack;

public class MyStack {
    private LinkedList l = new LinkedList();

    public void push(Object obj) {
        l.addFirst(obj);
    }
    /*  public Object Display(){
          return l.getFirst();

      }*/
    public Object pop(){
        return l.removeFirst();
    }
}
class Demo {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(70);
        s.push(30);
        s.push(56);
        System.out.println("the top element of stack "+ s.peek());


    }

}
