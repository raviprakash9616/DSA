package Recursion;

public class PrintDec {
    public static void printDecc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDecc(n-1);
    }
    public static void main(String[] args) {
       int n=10;
       printDecc(n);

    }
}
