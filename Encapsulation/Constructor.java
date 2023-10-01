package Encapsulation;

class Student2{
    private int age;
    private String name;
    Student2(){
        System.out.println("This Is A Default Constructor");
    }
    Student2(int age, String name){
        this.age=age;
        this.name=name;
    }
    void disp(){
        System.out.println(age);
        System.out.println(name);
    }


}
public class Constructor {
    public static void main(String[] args) {
    Student2 obj=new Student2(12,"Ravi");
    obj.disp();
    Student2 obj1=new Student2();
    obj1.disp();
    }
}
