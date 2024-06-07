

abstract
 class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("playing music...");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("driving car");
    }
}

class Flycar extends WagonR{ // concrete class
    public void fly(){
        System.out.println("flying car");
    }

}
    

public class abstractcls {
    public static void main(String[] args) {
        //Car obj = new WagonR();
        Car obj = new Flycar();
        obj.playMusic();
        obj.drive();
        obj.fly();
        
    }
    
}
