package Queue;

import java.util.*;

public class QueueFramework {
    public static void main(String[] args) {
//        Queue<Integer>q=new LinkedList<>();  // we Can Implement it by using linkedlst Class Because Queue is Interface So we can't make The object of Queue
        Queue<Integer>q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
