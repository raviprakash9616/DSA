package Encapsulation;

class Student{
     private int age; // Instance Variable
   private String name;
//   public void setData(){
//       age=12;
//       name="Rahul";
//   }
    public  void setData1(int age){
        this.age=age;
    }
    public void setData2(String name){
        this.name=name;
    }

    public void show(){
        System.out.println(age+" "+name);
    }
}
public class Demo {
    public static void main(String[] args) {
       Student obj=new Student();
        Student obj1=new Student();
       obj.setData1(11);
       obj1.setData1(12);
       obj.setData2("Ravi");
       obj1.setData2("Rahul");
       obj.show();
       obj1.show();
    }
}
