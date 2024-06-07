class mobile{
    String brand;
    int price;
    static String name; 

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
    /// static method ,, it can have a static variable in static method but we can not have instance variable
    // because the instance variable will have differnt values for the differnet obj's
    // to overcome this it should accept a obj of a class and use the .obj to refer which obj 
    public static void show1(mobile mob){
        System.out.println(mob.brand+" : "+mob.price+" : "+name);
    }

}

public class statmeth{
    public static void main(String[]args){

        mobile mob1 = new mobile();
        mob1.brand = "apple";
        mob1.price  = 1_20_000;
        mobile.name = "smartphone";

        mobile mob2 = new mobile();
        mob2.brand = "samsung";
        mob2.price = 70_000;
        mobile.name = "smartphone";

        mob1.show();
        mobile.show1(mob1);
        mobile.show1(mob2);

    }
}