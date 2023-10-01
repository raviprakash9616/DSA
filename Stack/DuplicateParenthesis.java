package Stack;

import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean isDuplicate(String str){
        Stack<Character>s=new Stack<>();
         for(int i=0;i<str.length();i++){
             char ch=str.charAt(i);
             // Case 2:=> Closing \\ If closing case is not exist then by default it is opening case
             if(ch==')'){
                 int count=0;
                 while( s.peek() !='('){
                     s.pop();
                     count++;
                 }
                 if(count<1){
                        return  true; // Duplicate Exist
                 }
                 else{
                      s.pop(); // Popped The Opening Pair
                 }
             }
            else{
                // Opening Condition
                 s.push(ch);
             }
         }
         return false;
    }
    public static void main(String[] args) {
        // Valid String
       String str="((a+b))"; // True
       String str2="(a-b)"; // False
        System.out.println(isDuplicate(str));
    }
}
