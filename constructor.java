class human
{
    private int age;
    private String name;


    public human(){          ////default constructor
        age = 12;
        name = "karthik";
    }

    public human(int age, String name) { //// parameterized constructor
        this.age = age;
        this.name = name;
    }
    
    

    public human(String name) {
        age = 18;
        this.name = name;
    }
      




    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class constructor {
    public static void main(String[]a){
        human man1 = new human();
        human man2 = new human();
        human man3 = new human(21,"iswaryan");
        human man4 = new human("jake");
        man1.setName("ishu");
        man1.setAge(20);
        
        human man[] = new human[4];
        man[0]=man1;
        man[1]=man2;
        man[2]=man3;
        man[3]=man4;


        // for(int i=0;i<4;i++){
        //     System.out.println(man[i].getName()+" : "+man[i].getAge());
            
        // }

        for(human m:man){
            System.out.println(m.getName()+" : "+m.getAge());

        }
        //System.out.println(man1.getName()+" : "+man1.getAge());
        //System.out.println(man2.getName()+" : "+man2.getAge());
        //System.out.println(man3.getName()+" : "+man3.getAge());
        //System.out.println(man4.getName()+" : "+man4.getAge());

    }
    
}
