// final --- variable/method/class

//final 
class Calc{
    public final void show(){
        System.out.println("in Calc show");
    }

    public void add(int n1, int n2){
        System.out.println(n1+n2);
    }

}

class AdvCalc //extends Calc ///{ throws an error as it is a final }
{
    public void show(){
        System.out.println("in AdvCalc show");
    }
}

public class Finalkeyword {
    public static void main(String[]a){

        final int num = 9;
        //num =10; throws an error as it is a final variable
        System.out.println(num);
        AdvCalc obj  =  new AdvCalc();
        obj.show();
        //obj.add(4,5);

        
    }
    
}
