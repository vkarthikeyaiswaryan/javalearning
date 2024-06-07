import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

class Students /*implements Comparable<Students>*/ {
    String name;
    int marks;


    public Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }


    public String toString() {
        return "Students [name=" + name + ", marks=" + marks + "]";
    }


   
    // public int compareTo(Students that) {
    //     if(this.marks < that.marks)
    //         return 1;
    //     else
    //         return -1;
    // }
}

public class ComparableVsComparator2{
    public static void main(String[] args) {

        Comparator<Students> comp = (i,j )-> i.marks< j.marks?1:-1;
        
        List<Students> studs = new ArrayList<Students>();

        studs.add(new Students("karthik", 90)) ;
        studs.add(new Students("jake", 70));
        studs.add(new Students("ishu", 80));
        studs.add(new Students("keer", 40));
        studs.add(new Students("karthikeya", 60));

        Collections.sort(studs,comp);

        for(Students s : studs)
            System.out.println(s);

        

    }
}
