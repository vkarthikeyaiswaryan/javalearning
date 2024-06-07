class human
{
    private int age;
    private String name;
   
    
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }
}

public class encaps {
    public static void main(String[]a){
        human man1 = new human();
        man1.setName("ishu");
        man1.setAge(20);
        
        System.out.println(man1.getName());
        System.out.println(man1.getAge());
        


    }
    
}
