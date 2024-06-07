interface A{

    int roll = 60; // variable in interface cannot be declared because 
    String name = "Karthikeya"; // as they are final and static
    void show();
    void config();
}

class Bcd implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}
// interface is used when we used to implement an abstract class consisting
// of all abstract methods.... 
// an interface has the public static by default......
public class interfacecpt {
    public static void main(String[] args) {
        A obj ;
        obj = new Bcd();
        // we cannot use interface type . so we have to use the class type Bcd
        obj.show();
        obj.config();

        System.out.println(A.name);

    }
}
