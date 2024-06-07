class student{
    int rollno;
    String name;
    int marks;
    
}

public class arrobj {
    public static void main(String[] args){
        student s1 =new student();
        s1.rollno = 1;
        s1.name = "karthik";
        s1.marks = 90;
        
        student s2= new student();
        s2.rollno =2;
        s2.name = "vennela";
        s2.marks = 96;

        student s3= new student();
        s3.rollno = 3;
        s3.name = "jake";
        s3.marks = 92;

       // System.out.println(s3.name + ":" +s3.marks);

        // student students[] = {s1,s2,s3};
        student students[] =new student[3];

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + ":" +students[i].marks);
        }
        // enhanced for loop
        // for(student stud : students){
        //     System.out.println(stud.name+ ":" +stud.marks);
        // }





    }
    
}
