class switchop{
    public static void main(String[] args){
        int x = 4;
        /*if(x==1)System.out.println("monday");
        else if(x==2)System.out.println("tuesday");
        else if(x==3)System.out.println("wednesday");
        else if(x==4)System.out.println("thursday");
        else if(x==5)System.out.println("friday");
        else if(x==6)System.out.println("saturday");
        else System.out.println("sunday");*/
        switch(x){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("enter a valid day");
            
        }


    }
}