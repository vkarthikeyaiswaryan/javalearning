class mobile{
    String brand;
    int price;
    static String name;


    public mobile(){
         // constructor
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    static{
        name = "phone";
        System.out.println("in static");
    }

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }


}

public class statblk{
    public static void main(String[] a){
        mobile mob1 = new mobile();
        mob1.brand = "apple";
        mob1.price = 1_20_000;
        mobile.name = "phone";

        mobile mob2 = new mobile();


        //Class.forName("mobile");
        mob1.show();
        mob2.show();

    }
}