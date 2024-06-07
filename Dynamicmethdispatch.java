
class Aa{
    public void show(){
        System.out.println(" in Aa show");
    }
}

class Bb extends Aa{  
    public void show(){
        System.out.println(" in Bb show");
    }
}

class Cc extends Aa{
    public void show(){
        System.out.println(" in Cc show");
    }
}
class Dd{
    public void show(){
        System.out.println(" in Dd show");
    }
}

public class Dynamicmethdispatch {
    public static void main(String[]a){

        // class Computer{

        // }

        // class Laptop extends Computer{

        // }

        // Computer obj = new Laptop();
        
        Aa obj = new Aa();//// different obj behave in differnet situations
        obj.show();

        obj = new Bb();  // doesn't know which method to use
        obj.show();

        obj = new Cc(); ///runtime polymorphism
        obj.show();

        //obj = new Dd();// should maintain the inheritance

    }
    
}
