class D{
    public void show() throws ClassNotFoundException{

        Class.forName("Kar");

        // try{
        // Class.forName("A");
        // }
        // catch(ClassNotFoundException e){
        //     System.out.println(" not able to find the class");
        // }

    }
    
}

public class DuckingThrows {

    static{
        System.out.println("class loaded");
    }
    public static void main(String[] args) {
        
        D obj = new D();
        try {
            obj.show();
        } 
        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
