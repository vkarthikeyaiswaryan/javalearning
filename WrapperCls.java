public class WrapperCls{
    public static void main(String[]a){
        int n = 10;
        //Integer num = new Integer(n); //boxing
        Integer num = n; // autoboxing
        System.out.println(n+num);

    
        double db = 13.4;
        Double d = new Double(db);
        System.out.println(d);
        //int  res = (Integer) d; not working


        
        //int n1 = num.intValue(); // unboxing
        int n1 = num; // auto unboxing
        System.out.println(n1);

        Character ch = 'A';
        char c = ch.charValue(); // char c = ch;
        System.out.println(c);

        String str = "12";
        System.out.println(Integer.parseInt(str)); 


    }

}