package Recursion;

public class PowerOfNum {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int nm1=power(x,n-1);
        int num=x*nm1;
        return num;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int result=power(x,n);
        System.out.println(result);
    }
}
//Time Complexity O(n)
//Space Complexity O(n)
