package Encapsulation;
 class Demo2 {
     static int a;
     static int b;
     int m;
     int n;
     static{
         System.out.println("Control In Static Block:");
         a=10;
         b=20;
     }
     {
         System.out.println("Control In Non Static Block");
         int m=30;
         int n=90;
     }
     static void display(){
         System.out.println("The Value Of a:"+a);
         System.out.println("The Value Of b:"+b);
     }
     void display1(){
         System.out.println("The Value Of m:"+m);
         System.out.println("The Value Of n:"+n);
     }

}
public class StaticAndNonStaticVariable
{
    public static void main(String[] args) {
        Demo2 d=new Demo2();
        Demo2.display();
        d.display1();
    }
}
