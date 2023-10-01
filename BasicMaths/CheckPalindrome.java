package BasicMaths;

public class CheckPalindrome {
    public static void chPalin(int N){
        int revNo=0;
        int duplicate=N;
        while(N>0){
            int ld=N%10;
            revNo=(revNo*10)+ld;
            N=N/10;
        }
        if(duplicate==revNo){
            System.out.println("No Is Plaindrome");
        }
        else {
            System.out.println("No Is Not PalinDrome");
        }
    }
    public static void main(String[] args) {
        chPalin(1213);
    }
}
