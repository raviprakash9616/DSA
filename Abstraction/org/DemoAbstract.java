package Abstraction.org;

 // In Interface method is by Default public And Abstract
// And Variable Is By Default Static and Final
interface A{
    void show();
    void config();
}
class B implements A{
    public void show() {
        System.out.println("Showing");
    }
    public void config() {
        System.out.println("Configuring");
    }
}
public class DemoAbstract {
    public static void main(String[] args) {
      A obj;
      obj=new  B();
      obj.show();
      obj.config();
    }
}
