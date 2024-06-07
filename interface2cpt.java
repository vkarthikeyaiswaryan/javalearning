// CLASS -----------> CLASS THEN EXTENDS
// INTERFACE -----------> CLASS THEN IMPLEMENTS
// INTERFACE ----------> INTERFACE THEN EXTENDS



interface A{

    int roll = 60; // variable in interface cannot be declared because 
    String name = "Karthikeya"; // as they are final and static
    void show();
    void config();
}

interface X {      
    void run();
}

interface Y extends X{

}

class Bcd implements A,Y{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    @Override
    public void run(){
        System.out.println("RUNNING.....");
    }
    
}
// interface is used when we used to implement an abstract class consisting
// of all abstract methods.... 
// an interface has the public static by default......
public class interface2cpt {
    public static void main(String[] args) {
        A obj ;
        obj = new Bcd();
        // we cannot interface type . so we have to use the class type Bc
        obj.show();
        obj.config();

        Y obj1 = new Bcd();
        obj1.run();

        System.out.println(A.name);

    }
}
