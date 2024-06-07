class Sengapindi{

    public void show1()
    {
        System.out.println("in Sengapindi stage");
    }

}

class Chakodi extends Sengapindi{

    public void show2()
    {
        System.out.println("in Chakodi stage");
    }

}

public class upcastdown {
    public static void main(String[]a){
        double n = 5.6;
        int i = (int)n;//typecast

        Sengapindi item = /* byDefault(Sengapindi)*/ new Chakodi(); // upcast ....subclass to super class
        item.show1();

        Chakodi item1 = (Chakodi)item; //downcast ..... super class to sub class
        item1.show2();

        
    }
    
}
