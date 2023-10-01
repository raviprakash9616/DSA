package Encapsulation;

class Student3{
    private int age;
    private String name;
    Student3(){
       age=10;
       name="Ram";
    }
    Student3(int age){
        this.age=age;
        name="Shyam";
    }
    Student3(int age,String name){
        this.age=age;
        this.name=name;
    }
    void disp(){
        System.out.println(age);
        System.out.println(name);
    }


}
public class Contructoroverloading {
    public static void main(String[] args) {
        Student3 obj=new Student3();
        obj.disp();
        Student3 obj1=new Student3(12);
        obj1.disp();
        Student3 obj2=new Student3(34,"Ghanshyam");
        obj2.disp();
    }
}
