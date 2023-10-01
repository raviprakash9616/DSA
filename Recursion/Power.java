package Recursion;

public class Power {
    public static int optimizedPow(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPower=optimizedPow(a,n/2);
        int halfPowerSq=halfPower*halfPower;
        //n is odd
        if(n%2!=0){
            halfPowerSq=a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a=2;
        int n=5;
       ;
        System.out.println( optimizedPow(a,n));
    }
}
