package StringDemo.StringJava;

import java.util.*;

public class PrintHashSetUsingIterator {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("TCS", "$100 billion");
        map.put("Wipro", "$21.5 billion");
        System.out.println(map);
       /* Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        System.out.println(hs);
      Iterator<Integer> ip =hs.iterator();
      while ((ip.hasNext())){
          System.out.println(ip.next());
        }*/
    }
}
