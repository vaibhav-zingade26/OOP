package collections_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class collections_demo {
    public static void main(String[] args) {
        HashMap<Integer, String > vd = new HashMap<>();
        vd.put(1,"vaibhav");
        vd.put(8,"darshan");
        vd.put(null,"dada");
        vd.put(4,"kelash");
        vd.put(4,"shubham");

        System.out.println(vd.keySet());
        System.out.println(vd.values());

        LinkedHashSet<Integer> v=new LinkedHashSet<>();
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);v.add(1);v.add(1);
        v.add(1);
        v.add(1);v.add(3);
        System.out.println(v);

        LinkedList ls = new LinkedList<>();

        ls.add("vahugd");
        ls.add(true);
        ls.add(1);
        ls.add('v');ls.add(v);ls.add("vaibhav");
        ls.add(vd.values());

        System.out.println(ls);

        ArrayList al = new ArrayList<>();
        al.add("vahugd");
        al.add(true);
        al.add(null);
        al.add('v');al.add(v);al.add("vaibhav");
        al.add(vd.values());
        System.out.println(al);

    }
}
