enum Status{
    Pending,Running,Failed,Success;
}

public class enumifswitch{
    public static void main(String[] args) {
        
        Status s = Status.Pending;

        // if (s == Status.Pending){
        //     System.out.println("wait");

        // }

        // else if (s == Status.Running){
        //     System.out.println("processing");
        // }

        // else if ( s == Status.Failed){
        //     System.out.println("try again");
        // }

        // else {
        //     System.out.println("done");
        // }


        switch(s){
            case Pending:
                System.out.println("wait");
                break;

            case Failed:
                System.out.println("try again");
                break;
            
            case Success:
                System.out.println("done");
                break;

            default:
                System.out.println("processing");
                break;

        }

    }
}