package dataframe;
import java.util.*;


public class hashmap2 {


    public hashmap2() {
        super();
    }

    public static void main(String args[]) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

        }
    }
}
    /*
    while (it.hasNext)
            println(it.next())
            */