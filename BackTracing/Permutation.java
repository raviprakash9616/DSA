package BackTracing;

public class Permutation {
    public static void findPermutation(String str,String ans){
        // Base Case
        if(str.length()==0){
            System.out.println(ans);
        }
        for(int i=0;i<str.length();i++) {
            char curr = str.charAt(i);
            // abcd=ab+d to remove the c we have to follow this method
            String newStr=str.substring(0,i)+str.substring(i+1);
            // Recursive Function
            findPermutation(newStr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermutation(str,"");


    }
}
// Time Complexity:o(N*(N!);
