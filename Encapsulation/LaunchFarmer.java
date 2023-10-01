package Encapsulation;
import java.util.Scanner;
class Farmer{
    int pa;
    float td;
   static float ri;
    float si;
    static{
        ri=4.5f;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter The Amount Required:");
        pa= sc.nextInt();
        System.out.println("Please Enter Time Duration:");
         td= sc.nextFloat();
    }
    void compute(){
        si=(pa*td*ri)/100f;
    }
    void display(){
        System.out.println("SI Is:" +si);
    }
}
public class LaunchFarmer {
    public static void main(String[] args) {

        Farmer f1=new Farmer();
        Farmer f2=new Farmer();
        f1.input();
        f1.compute();
        f1.display();
    }
}
