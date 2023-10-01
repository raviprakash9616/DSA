package Stack;
import java.util.ArrayList;

// Ques:=> Stack Implementation Using ArrayList
public class StackB {
    static class Stack{
   static ArrayList<Integer> list=new ArrayList<>();
       public static boolean isEmpty() {
           if (list.size() == 0) {
               return list.size() == 0;
           }
           return false;
       }
           // Push Operation
           public static void push(int data){
               list.add(data);
           }
           // Pop Operation
           public static int pop(){
           if(isEmpty()){    //  T0 Check Stack Is Empty
               return -1;
           }
           int top=list.get(list.size()-1);
           list.remove(list.size()-1);
           return top;
           }
           // Peek Operation
        public static int peek(){
            if(isEmpty()){    //  T0 Check Stack Is Empty
                return -1;
            }
           return list.get(list.size()-1);
        }
       }
    public static void main(String[] args) {
         Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
