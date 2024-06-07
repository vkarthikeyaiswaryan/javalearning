 class logicops{
    public static void main( String args[]){
        int x = 3;
        int y = 4;
        double h = 6.0;
        double g = 7.0;
        //logicops
        // && ------> and operator
        boolean res = x<y && h<g;System.out.println(res);
        boolean res1= x<y && h>g;System.out.println(res1);
        boolean res2 = x>y && h<g;System.out.println(res2);
        boolean res3 = x>y && h>g;System.out.println(res3);
        // || --------. or operator
        boolean res4 = x<y || h<g;System.out.println(res4);
        boolean res5 =x<y || h>g;System.out.println(res5);
        boolean res6 = x>y || h<g;System.out.println(res6);
        boolean res7 = x>y|| h>g;System.out.println(res7);
        boolean res8 = x>y || h>g || x==3.0;System.out.println(res8);
        // ! ------> not operator
        System.out.println(!res8);
    }
 }