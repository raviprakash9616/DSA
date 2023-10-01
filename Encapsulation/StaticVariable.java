package Encapsulation;


public class StaticVariable {
    static int a;
    static{
        System.out.println("This Is A Static Block");// static variable and static block is execute before while class loading it does not require to make an object for access.
        a=10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("This Is A main Block");
    }
}
