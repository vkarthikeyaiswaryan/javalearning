public class strbuffbuild {
    public static void main(String[]args){
        // actually String is a immutable obj but we have StringBuffer and StringBuilder for a mutauble ops..
        StringBuffer str = new StringBuffer("ishu");
        System.out.println(str.capacity());
        System.out.println(str.length());
        str.append(" idiot");
        System.out.println(str);
        str.ensureCapacity(100);
        str.setLength(30);
        System.out.println(str.capacity());
        System.out.println(str.length());
        str.insert(5, "karthik ");
        System.out.println(str);
        /// same for StringBuilder 

    }
}
