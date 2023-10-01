package Stack;

import java.util.Stack;

public class StackI {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nxtGreater[]=new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            // Step=>:1 while ko chalana
              while (!s.isEmpty() && arr[s.peek()]<=arr[i]){
                  s.pop();
              }
            // Step=>:2 If-Else Ko Check Karna
                 if(s.isEmpty()){
                     nxtGreater[i]=-1;
                 }
                 else{
                     nxtGreater[i]=arr[s.peek()];
                 }
            // Step=>:3 Push In Stack
          s.push(i);
        }
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}
//Variation Of This Question
//Next Greater Right
// Next Greater Left
// Next Smaller Right
// Next Smaller Left
