

import tools.mathops.A2;

class c extends A2{
    public void showGrade(){
        System.out.println(grade);
    }
}
// private can be accessed only in the same class irrespective of the package
public class Accessmodifiers //extends A2
    {
    public static void main(String[]a){
        A2 obj = new A2();
        System.out.println(obj.marks); // class A2 belongs to different package .. marks should me made public inorder to access
        obj.show(); 

        B2 obj1 = new B2();
        System.out.println(obj1.marks); // (default keyword) ...same package (folder) no need to public ....directly we can access....
        
        c obj3 = new c();obj3.showGrade();
        //System.out.println(grade);
        // protected can be accessed in the same packages and differernt package subclass (uses extends) 
        // but cannot be accessed in the different package nonsubclass 

    }
}

/*                                     PUBLIC        PRIVATE        PROTECTED         DEFAULT
 * SAME CLASS                          YES            YES             YES               YES
 * 
 * SAME PACKAGE SUB CLASS              YES                            YES               YES
 * 
 * SAME PACKAGE NON SUB CLASS          YES                            YES               YES
 * 
 * DIFFERENT PACKAGE SUB CLASS         YES                            YES
 * 
 * DIFFERENT PACKAGE NNO SUB CLASS     YES
 * 
 * 
 * 
 * best way to use public for classes and private for instance variables and 
 * 
 * * public for methods and protected for the methods to use it in a subclass
 */ 

