class typecast{
    public static void main (String args[]){
        byte b = 127;
        int a = 257;//6
        //a=b; //implicit conversion and widening
        //b=a;// doesn't assign the value(lossy conversion) and narrowing
        System.out.println(a);
        b=(byte)a;//257%256(range of byte {-128 to 127})=1
        System.out.println(b);
        float fl = 5.6f;
        int x = (int)fl;
        System.out.println(x); 
        // type promotion
        byte num1 = 10;
        byte num2 = 30;
        int res = num1*num2;
        System.out.println(res);
        



    }
}