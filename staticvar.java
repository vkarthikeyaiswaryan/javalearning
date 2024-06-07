class mobile{
    String brand;
    int price;
    static String name;
     
    public void show(){
         System.out.println(brand+" : "+price+" : "+ name );
    }
    
    
}

public class staticvar {
    public static void main(String[]args){
        mobile mob1 = new mobile();
        mob1.brand = "apple";
        mob1.price = 1_20_000;
        mob1.name = "smartphone"; 

        mobile mob2 = new mobile();
        mob2.brand = "samsung";
        mob2.price = 70_000;
        mobile.name = "smartphone";

        mobile mob3 = new mobile();
        mob3.brand = "vivo";
        mob3.price = 30_000;
        mobile.name = "smartphone";

        mob1.name="phone";

        mob1.show();
        mob2.show();
        mob3.show();

    }
    
}
