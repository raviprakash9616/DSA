package Queue;
import java.util.*;
// Implementation of Deque In The Form Of Stack
public class DequeB {
    static class Stack{
        Deque<Integer>deque=new LinkedList<>();
        public void push(int data){
           deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
     Stack s=new Stack();
     s.push(1);
     s.push(2);
     s.push(3);
        System.out.println("Peek :" +s.peek());
        while (!s.deque.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
