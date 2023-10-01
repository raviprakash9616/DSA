package BackTracing;

public class Subset {
    public static void findSubset(String str,String ans,int i){
        // Base Case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //Recursive Call
        //yes
        findSubset(str,ans+str.charAt(i),i+1);
        // No Part
        findSubset(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        findSubset(str,"",0);
    }
}
