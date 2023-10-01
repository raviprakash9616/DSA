package Recursion;

public class Fact {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int nm1=factorial(n-1);
        int fct=n*factorial(n-1);
        return fct;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(factorial(n));
    }
}
