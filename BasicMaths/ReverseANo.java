package BasicMaths;

public class ReverseANo {
    public static int reverseDigit(int n){
        int revNo=0;
        while(n>0){
            int lastDigit=n%10;
            revNo = (revNo * 10) + lastDigit;
            n=n/10;
        }
        return revNo;
    }
    public static void main(String[] args) {
int result=reverseDigit(12345);
        System.out.println(result);
    }
}
