@Deprecated
class CoffeePrep{
    public void preparationUsingMilkFirst(){
        System.out.println("using milk....");
    }
    
}

class ColdCoffeePrep extends CoffeePrep{
    @Override
    public void preparationUsingMilkFirst(){
        System.out.println("using cold milk");
    }
}

public class Annotation {
    public static void main(String[] args) {

        CoffeePrep cup = new ColdCoffeePrep();

        cup.preparationUsingMilkFirst();

    }
}
