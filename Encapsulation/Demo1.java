package Encapsulation;


class Student1{
    private int age; // Instance Variable
    private String name;
    public  void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Student1 obj=new Student1();
        Student1 obj1=new Student1();
        obj.setAge(21);
        obj1.setAge(12);
        obj.setName("Ravi");
        obj1.setName("Rahul");
        int stud1=obj.getAge();
        String stud2= obj.getName();
        System.out.println(stud1);
        System.out.println(stud2);
    }
}
