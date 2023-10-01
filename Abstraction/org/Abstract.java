package Abstraction.org;

abstract class Car {
    public abstract void drive();
    public abstract void flying();

    public void playMusic() {
        System.out.println("Playing Music");
    }
}
   abstract class WagonR extends Car{
        public void drive(){
            System.out.println("Driving");
        }
    }
    class updatedWagonR extends WagonR{
    public void flying(){
        System.out.println("FLYING");
    }
    }

public class Abstract {
    public static void main(String[] args) {
Car obj=new updatedWagonR();
obj.drive();
obj.flying();
//obj.playMusic();
     }
}
