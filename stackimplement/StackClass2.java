package stackimplement;
import java.util.*;
//IMPLEMENTATION USING INBUILT STACK METHOD
public class StackClass2 {

    public static void main(String [] args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(5);
        s.push(7);
        s.push(8);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
