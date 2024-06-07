enum Status{
    Running,Failed,Pending,Success;
}

public class enumcpt {
    public static void main(String[] args) {
        
        // Status sss = Status.Running;
        // System.out.println(sss);
        // System.out.println(sss.ordinal());
        
        // Status ss[] = Status.values();
        // // System.out.println(s.ordinal());

        Status ss[] = Status.values();
        // System.out.println(ss[1]);

        for(Status s : ss){
            System.out.println(s +" : "+ s.ordinal());
        }
    }
    
}
