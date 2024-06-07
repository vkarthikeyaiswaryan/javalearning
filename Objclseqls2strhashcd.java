class Laptop{
    int price;
    String brand;

    @Override
    public String toString() {
        return "Laptop [price=" + price + ", brand=" + brand + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        return true;
    }

    // public boolean equals(Laptop that){
    //     return this.brand.equals(that.brand) && this.price == that.price;
    // }

    

    
}
public class Objclseqls2strhashcd {
    public static void main(String[]a){
        Laptop obj = new Laptop();
        obj.brand = "hppavilionx360";
        obj.price = 56_000;

        Laptop obj1 = new Laptop();
        obj1.brand = "hppavilionx360";
        obj1.price = 56_000;

        //System.out.println(obj.toString()); by default
        System.out.println(obj);//both are same and gives an output as hashcode

        //boolean res = obj == obj1;
        boolean res = obj.equals(obj1);
        System.out.println(res);

    }
    
}
 