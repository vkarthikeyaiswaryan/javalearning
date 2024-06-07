import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> marks = new HashMap<String,Integer>(); //Hashtable is synchronised version of HashMap

        marks.put("karthik",99);
        marks.put("jake",80);
        marks.put("keer",99);
        marks.put("karthik",87);
        marks.put("ishu",45);

        System.out.println(marks);

        System.out.println(marks.keySet());

        for(String key : marks.keySet() ){
            System.out.println(key + ":" + marks.get(key) );
        }

    }
    
}
